package com.gj;

import static org.junit.Assert.assertTrue;

import com.gj.beans.Bean1;
import com.gj.beans.Bean2;
import com.gj.beans.Bean3;
import com.gj.beans.Bean4;
import com.gj.factory.MyFactoryBean2;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AppTest {

    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("ac.xml");
        Bean1 bean1=ac.getBean("bean1",Bean1.class);
        System.out.println("============");
        System.out.println(bean1);

        System.out.println("============");
        Bean2 bean2=(Bean2) ac.getBean("bean2",Bean2.class);
        System.out.println(bean2);

        System.out.println("============");
        Bean3 bean3=(Bean3) ac.getBean("bean3",Bean3.class);
        System.out.println(bean3);

        System.out.println("============");
        Bean4 bean4_1=(Bean4) ac.getBean("bean4",Bean4.class);
        Bean4 bean4_2=(Bean4) ac.getBean("bean4",Bean4.class);
        System.out.println(bean4_1==bean4_2);
    }
}
