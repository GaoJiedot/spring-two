package com.gj.factory;

import com.gj.beans.Bean2;

public class MyFactoryBean2 {
    public static Bean2 createBean2(){
        return new Bean2() ;
    }
}

