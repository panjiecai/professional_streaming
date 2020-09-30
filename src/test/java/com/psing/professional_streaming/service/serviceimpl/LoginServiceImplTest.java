package com.psing.professional_streaming.service.serviceimpl;

import com.psing.professional_streaming.dataobject.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoginServiceImplTest {

    @Autowired
    private LoginServiceImpl loginService;

    private final String USERNAME = "111111";
    private final String PASSWORD = "111111";

    @Test
    public void loginTest() throws Exception{
        User result = loginService.login(USERNAME, PASSWORD);
        log.info("【用户登录】 result={}", result);
        Assert.assertNotNull(result);
    }
}