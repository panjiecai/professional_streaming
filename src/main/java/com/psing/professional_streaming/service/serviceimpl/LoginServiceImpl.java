package com.psing.professional_streaming.service.serviceimpl;

import com.psing.professional_streaming.dataobject.User;
import com.psing.professional_streaming.enums.ResultEnum;
import com.psing.professional_streaming.exception.PSingException;
import com.psing.professional_streaming.repository.UserRepository;
import com.psing.professional_streaming.service.LoginService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserRepository userRepository;

    //1.用户名密码是否匹配; 2.用户类型留给controller
    public User login(String username, String password){

        User user = userRepository.findByUsername(username);

        if(user == null){
            log.info("【用户登录】 用户名不存在, username={}", username);
            throw new PSingException(ResultEnum.USER_NAME_ERROR);
        }

        if(!user.getPassword().equals(password)){
            log.info("【用户登录】 密码错误, username={}, password1={}, password2={}", username, password, user.getPassword());
            throw new PSingException(ResultEnum.USER_PWD_ERROR);
        }

        return user;
    }
}
