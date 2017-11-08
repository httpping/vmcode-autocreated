package com.vpclub.provider.service.impl;

import com.vpclub.provider.entity.Users;
import com.vpclub.provider.mapper.UsersMapper;
import com.vpclub.provider.service.IUsersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import cn.vpclub.moses.core.enums.ReturnCodeEnum;
import cn.vpclub.moses.core.model.response.BackResponseUtil;
import cn.vpclub.moses.core.model.response.BaseResponse;
import cn.vpclub.moses.core.model.response.ResponseConvert;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.vpclub.provider.model.request.UsersPageParam;
import java.util.List;
/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tp
 * @since 2017-11-08
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {

    public UsersServiceImpl() {
        super();
    }
    
    public UsersServiceImpl(UsersMapper baseMapper) {
        this.baseMapper = baseMapper;
    }
    /**
     * 添加方法
     * @return
     */
    @Override
    public BaseResponse add(Users model) {
        boolean back = this.insertOrUpdate(model);
        BaseResponse baseResponse = ResponseConvert.convert(back);
        return baseResponse;
    }
    /**
    * 删除
    * @return
    */
    @Override
    public BaseResponse delete(Users model) {
        BaseResponse baseResponse ;
        if (null == model || null == model.getId()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
        boolean back = this.deleteById(model.getId());
            baseResponse = ResponseConvert.convert(back);
        }
        return baseResponse;
    }
    /**
    * 修改方法
    * @return
    */
    @Override
    public BaseResponse update(Users model) {
        BaseResponse baseResponse ;
        if (null == model || null == model.getId()) {
        baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
        boolean back = this.updateById(model);
        baseResponse = ResponseConvert.convert(back);
        }
        return baseResponse;
    }
    /**
    * 单个查询
    * @return
    */
    @Override
    public BaseResponse query(Users model) {
        BaseResponse baseResponse;
        if (null == model || null == model.getId()) {
            baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1006.getCode());
        } else {
            Users data = this.selectById(model.getId());
            if (null != data) {
                baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1000.getCode());
                baseResponse.setDataInfo(data);
            } else {
                 baseResponse = BackResponseUtil.getBaseResponse(ReturnCodeEnum.CODE_1002.getCode());
            }
        }
        return baseResponse;
    }
    
    /**
    * 条件查询分页列表
    * @param pageParam
    * @return
    */
    @Override
    public Page page(UsersPageParam pageParam) {
        Page<Users> page = new Page<Users>();

        Page<Users> pageResponse = null;
        //封装条件
        EntityWrapper<Users> ew = new EntityWrapper<Users>();

        //针对分页判断
        if (null != pageParam && null != pageParam.getPageNumber() && null != pageParam.getPageSize()) {
        page.setCurrent(pageParam.getPageNumber());
        page.setSize(pageParam.getPageSize());
        pageResponse = this.selectPage(page, ew);
        } else {
        List<Users> selectList = this.selectList(ew);
        pageResponse = new Page<>();
        pageResponse.setRecords(selectList);
        }
        //记录数
        pageResponse.setTotal(this.selectCount(ew));
        return pageResponse;
    }
}
