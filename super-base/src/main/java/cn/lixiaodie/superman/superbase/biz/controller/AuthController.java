package cn.lixiaodie.superman.superbase.biz.controller;

import cn.lixiaodie.superman.superbase.biz.service.IAuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 基础服务的登录认证控制层
 * @author lisheng
 * @date
 * @version v1.0.0
 * @since v1.0.0
 */
@RequestMapping("/auth")
@RestController
public class AuthController {

    @Autowired
    private IAuthService authService;

    @GetMapping("/login")
    String login() {
        return authService.login();
    }
}
