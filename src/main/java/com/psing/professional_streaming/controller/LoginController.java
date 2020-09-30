package com.psing.professional_streaming.controller;


import com.psing.professional_streaming.VO.ResultVO;
import com.psing.professional_streaming.dataobject.User;
import com.psing.professional_streaming.enums.UserTypeEnum;
import com.psing.professional_streaming.service.LoginService;
import com.psing.professional_streaming.service.serviceimpl.LoginServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private LoginServiceImpl loginService;

    @PostMapping("/signin")
    public ResultVO login(@RequestParam("username") String username,
                          @RequestParam("password") String password){
        User user = loginService.login(username, password);
        switch (UserTypeEnum.getUserTypeEnum(user.getType())){
            case USER_TYPE_STUDENT:
                //TODO
                break;
            case USER_TYPE_CHARGE:
                //TODO
                break;
            case USER_TYPE_ADMIN:
                //TODO
                break;
            default:
                //TODO
                break;
        }
    }
}
