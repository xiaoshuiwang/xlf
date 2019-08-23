package cn.com.xlf.app.system.controller;

import cn.com.xlf.services.system.domain.SysUser;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 系统controller
 */
@RestController
public class SysUserController {

    @GetMapping
    public SysUser hello(){
        SysUser sysUser = new SysUser();
        sysUser.setName("xiaoming");
        sysUser.setLoginName("hero");
        sysUser.setPassWord("xm123456");
        sysUser.setPhone("13838389438");
        sysUser.setEmail("13838389438@163.com");
        return sysUser;
    }
}
