package cn.edu.guet.ioc;

import cn.edu.guet.ioc.service.IUserService;
import cn.edu.guet.ioc.service.Impl.IUserServiceImpl;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("请输入用户名：");
        String userName=input.next();
        System.out.println("请输入密码");
        String possword=input.next();

        System.out.println(userName);
        System.out.println(possword);

        IUserServiceImpl iUserService=new IUserServiceImpl();
        iUserService.longein(userName,possword);

    }
}
