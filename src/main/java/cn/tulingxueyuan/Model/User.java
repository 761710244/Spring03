package cn.tulingxueyuan.Model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
    /*  通过value设置依赖注入的属性:
        1.写死为固定的值
        2.通过${}或者#{}取值; $只需要将对应文件的key即可取到，#需要传参为类型.属性，且该类也需要注册为Bean
    * */
    @Value("${mysql.username}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("User已加载");
    }
}
