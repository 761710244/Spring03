package cn.tulingxueyuan.Model;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@DependsOn("user")  //  添加依赖，修改加载的顺序
//@Lazy   //  懒加载
public class Role {
    private String role;

    public Role() {
        System.out.println("Role已加载");
    }

    //  生命周期，初始化
    @PostConstruct
    public void init() {
        System.out.println("Role初始化");
    }

    //  生命周期，销毁
    @PreDestroy
    public void destroy() {
        System.out.println("Role销毁");
    }
}
