package com.gj;
import com.gj.tsetaop2.Service2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMessage {
    public static void main(String[] args) throws Exception {
        ApplicationContext context=new ClassPathXmlApplicationContext("ac.xml");
        Service2 service2=context.getBean("service2",Service2.class);
        service2.service();
    }
}
