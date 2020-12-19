package cn.tulingxueyuan.Dao.impl;

import cn.tulingxueyuan.Dao.UserDao;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

    public void getUser() {
        System.out.println("查询数据库");
    }
}
