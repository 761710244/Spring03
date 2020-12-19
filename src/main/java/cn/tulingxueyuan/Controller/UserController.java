package cn.tulingxueyuan.Controller;

import cn.tulingxueyuan.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {

    /**
     * 使用@Autowired实现自动注入
     * 默认优先根据类型byType匹配，其次byName，类名首字母小写
     */
    @Autowired
    UserService service;

    public void getUser() {
        service.getUser();
    }
}
