package com.gj.factory;

import com.gj.beans.Bean2;
import com.gj.beans.Bean3;

public class MyFactoryBean3 {
     public MyFactoryBean3(){
         System.out.println("测试用：bean3factory实例化中");
     }
    public  Bean3 createBean3(){
        return new Bean3() ;
    }
}

