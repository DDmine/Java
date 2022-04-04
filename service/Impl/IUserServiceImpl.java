package cn.edu.guet.ioc.service.Impl;

import cn.edu.guet.ioc.dao.Impl.IUserDaoImpl;
import cn.edu.guet.ioc.service.IUserService;

public class IUserServiceImpl implements IUserService {

    private IUserDaoImpl iUserDao;
    public IUserServiceImpl(){
        iUserDao=new IUserDaoImpl();
    }
    @Override
    public void longein(String userName, String possword) {

        iUserDao.longein(userName,possword);

    }
}
