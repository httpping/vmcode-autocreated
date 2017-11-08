package com.vpclub.provider.rpc;

import java.io.Serializable;

import com.vpclub.provider.service.IUsersService;
import com.baomidou.mybatisplus.service.IService;




import cn.vpclub.moses.core.enums.ReturnCodeEnum;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.utils.grpc.proto.TypeProto;
import com.baomidou.mybatisplus.plugins.Page;
import org.apache.commons.collections.CollectionUtils;

import com.vpclub.provider.entity.Users;
import com.vpclub.provider.model.request.UsersPageParam;
import com.vpclub.provider.service.IUsersService;

import com.vpclub.provider.service.rpc.UsersProto;
import com.vpclub.provider.service.rpc.UsersProto.*;

import com.vpclub.provider.service.rpc.UsersServiceGrpc;


import io.grpc.stub.StreamObserver;
import lombok.Data;
import lombok.experimental.Accessors;
import lombok.extern.slf4j.Slf4j;

import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.fromGRpcMessage;
import static cn.vpclub.moses.utils.grpc.GRpcMessageConverter.toGRpcMessage;


/**
 * <p>
 * 
 * </p>
 *
 * @author tp
 * @since 2017-11-08
 */
@Data
@Accessors(chain = true)
@Slf4j
//@GRpcService
public class UsersRpc extends UsersServiceGrpc.UsersServiceImplBase   {

    private IUsersService service;

    public UsersRpc(IUsersService service) {
        this.service = service;
    }

    @Override
    public void add(UsersProto.UsersDTO request, StreamObserver<UsersProto.UsersResponse> responseObserver) {
        Users model = (Users) fromGRpcMessage(request, Users.class);
        BaseResponse baseResponse = service.add(model);
        UsersResponse response = (UsersResponse) toGRpcMessage(baseResponse, UsersResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void query(UsersProto.UsersDTO request, StreamObserver<UsersProto.UsersResponse> responseObserver) {
        Users model = (Users) fromGRpcMessage(request, Users.class);
        BaseResponse baseResponse = service.query(model);
        UsersResponse response = (UsersResponse) toGRpcMessage(baseResponse, UsersResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void update(UsersProto.UsersDTO request, StreamObserver<UsersProto.UsersResponse> responseObserver) {
        Users model = (Users) fromGRpcMessage(request, Users.class);
        BaseResponse baseResponse = service.update(model);
        UsersResponse response = (UsersResponse) toGRpcMessage(baseResponse, UsersResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(UsersProto.UsersDTO request, StreamObserver<UsersProto.UsersResponse> responseObserver) {
        //业务操作
        Users model = (Users) fromGRpcMessage(request, Users.class);
        BaseResponse baseResponse = service.delete(model);
        UsersResponse response = (UsersResponse) toGRpcMessage(baseResponse, UsersResponse.newBuilder());
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void page(UsersProto.UsersRequest request, StreamObserver<UsersProto.UsersPageResponse> responseObserver) {
        UsersPageResponse response;
        UsersPageParam pageParam = (UsersPageParam) fromGRpcMessage(request, UsersPageParam.class);

        Page<Users> selectPage = service.page(pageParam);
        response = (UsersPageResponse) toGRpcMessage(selectPage, UsersPageResponse.newBuilder());
        //back
        TypeProto.Integer.Builder returnCode = TypeProto.Integer.newBuilder();
        String message = "";
        if (CollectionUtils.isNotEmpty(selectPage.getRecords())) {
            returnCode = returnCode.setValue(ReturnCodeEnum.CODE_1000.getCode());
            message=ReturnCodeEnum.CODE_1000.getValue();
        }
        else {
            returnCode = returnCode.setValue(ReturnCodeEnum.CODE_1002.getCode());
            message=ReturnCodeEnum.CODE_1002.getValue();
        }
        response = response.toBuilder().setReturnCode(returnCode.build().getValue())
                .setMessage(message).build();
        log.debug("page select back : {}",response);
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
	
}
