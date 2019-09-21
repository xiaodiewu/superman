package cn.lixiaodie.superman.superbase.biz.service.impl;

import cn.lixiaodie.superman.superbase.biz.service.IAuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements IAuthService {

    @Override
    public String login() {
        return "Hello world!";
    }
}
