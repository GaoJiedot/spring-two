package com.gj;
import static org.junit.Assert.assertTrue;
import com.gj.service.Impl.UserServiceImpl;
import com.gj.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class AppTest {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ac.xml");
        UserServiceImpl ser=ac.getBean("UserService",UserServiceImpl.class);
        boolean b=ser.login("gj","1234");
        if (b){
            System.out.println("登陆成功");
        }else {
            System.out.println("登陆失败");
        }
    }
}
