package cn.edu.guet.ioc.dao.Impl;

import cn.edu.guet.ioc.dao.IUserDao;

public class IUserDaoImpl implements IUserDao {
    @Override
    public void longein(String userName, String password) {
        if(userName.equals("1234")&&password.equals("1111")){
            System.out.println("登录成功");
        }else {
            System.out.println("登录失败");
        }
    }
}
