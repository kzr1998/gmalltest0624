package com.guli.gmall.user.service.Impl;

import com.guli.gmall.user.bean.beanUserInfo;
import com.guli.gmall.user.mapper.UserInfoMapper;
import com.guli.gmall.user.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    // 调用数据访问层 @Autowired 自动注入，前提条件？将UserInfoMapper 放入spring 容器
    @Autowired
    private UserInfoMapper userInfoMapper;

    //查出所有
    @Override
    public List<beanUserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public beanUserInfo getUserInfoByName(String name) {
        return null;
    }

    @Override
    public List<beanUserInfo> getUserInfoListByName(beanUserInfo userInfo) {
        return null;
    }

    @Override
    public List<beanUserInfo> getUserInfoListByNickName(beanUserInfo userInfo) {
        return null;
    }

    @Override
    public void addUser(beanUserInfo userInfo) {

    }

    @Override
    public void updUser(beanUserInfo userInfo) {

    }

    @Override
    public void delUser(beanUserInfo userInfo) {

    }
}
