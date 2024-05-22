package com.gj;
import com.gj.testaop.Service1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestRecode {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("ac.xml");
        Service1 service1 = context.getBean("service1",Service1.class);
        service1.service();
    }
}
