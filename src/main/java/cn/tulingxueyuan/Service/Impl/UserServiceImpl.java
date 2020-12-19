package cn.tulingxueyuan.Service.Impl;

import cn.tulingxueyuan.Dao.UserDao;
import cn.tulingxueyuan.Service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {

    /**
     * @Resource 和 @Autowired的区别
     * 1.@Resource依赖jdk，Autowired依赖Spring
     * 2.@Resource优先根据名字匹配，Autowired有限根据类型匹配
     */
//    @Autowired
    @Resource
    UserDao dao;

    public void getUser() {
        dao.getUser();
    }
}
