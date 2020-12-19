package cn.tulingxueyuan.Controller;

import cn.tulingxueyuan.Dao.impl.UserDaoImpl;
import cn.tulingxueyuan.Model.Role;
import cn.tulingxueyuan.Model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocTest {
    ClassPathXmlApplicationContext ioc;

    @Before
    public void before() {
        ioc = new ClassPathXmlApplicationContext("spring.xml");
    }

    @Test
    public void test01() {
        UserDaoImpl bean = ioc.getBean(UserDaoImpl.class);
        System.out.println(bean);
    }

    @Test
    public void test02() {
        User bean = ioc.getBean(User.class);
        System.out.println(bean.getName());
    }

    @Test
    public void test03() {
        UserController bean = ioc.getBean(UserController.class);
        bean.getUser();
    }

    @Test
    public void test04() {

    }

    @Test
    public void test05() {
        Role bean = ioc.getBean(Role.class);
        ioc.close();
    }
}
