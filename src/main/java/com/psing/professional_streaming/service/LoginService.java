package com.psing.professional_streaming.service;

import com.psing.professional_streaming.dataobject.User;

public interface LoginService {

    //1.用户名密码是否匹配; 2.用户类型
    User login(String username, String password);
}
