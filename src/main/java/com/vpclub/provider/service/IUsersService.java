package com.vpclub.provider.service;

import com.vpclub.provider.entity.Users;
import com.baomidou.mybatisplus.service.IService;

import com.vpclub.provider.model.request.UsersPageParam;

import cn.vpclub.moses.core.model.response.BaseResponse;
import com.baomidou.mybatisplus.plugins.Page;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author tp
 * @since 2017-11-08
 */
public interface IUsersService extends IService<Users> {
    /**
    * 添加方法
    * @return
    */
    public BaseResponse add(Users model);
    /**
    * 删除
    * @return
    */
    public BaseResponse delete(Users model);
    /**
    * 修改方法
    * @return
    */
    public BaseResponse update(Users model);
    /**
    * 单个查询
    * @return
    */
    public BaseResponse query(Users model);

    /**
    * 条件查询分页列表
    * @param pageParam
    * @return
    */
    public Page page(UsersPageParam pageParam);

}
