package com.guli.gmall.user.service;

import com.guli.gmall.user.bean.beanUserInfo;

import java.util.List;

public interface UserInfoService {

    /**
     * 查询所有用户数据
     * @return
     */
    List<beanUserInfo> findAll();

    /**
     *
     * @param name
     * @return
     */
    beanUserInfo getUserInfoByName(String name);

    /**
     *
     * @param userInfo
     * @return
     */
    List<beanUserInfo> getUserInfoListByName(beanUserInfo userInfo);
    /**
     *
     * @param userInfo
     * @return
     */
    List<beanUserInfo> getUserInfoListByNickName(beanUserInfo userInfo);
    // int ,boolean, void

    /**
     * 添加用户信息
     * @param userInfo
     */
    void addUser(beanUserInfo userInfo);

    /**
     *
     * @param userInfo
     */
    void updUser(beanUserInfo userInfo);

    /**
     *
     * @param userInfo
     */
    void delUser(beanUserInfo userInfo);
}
