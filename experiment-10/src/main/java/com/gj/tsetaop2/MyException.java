package com.gj.tsetaop2;
public class MyException extends Exception{
    private static final long serialVersionUID=1L;
    private String msg;
    public MyException(String msg){
        super();
        this.msg=msg;

    }
    public String setMsg(){
        return msg;
    }
    public String getMsg() {
        return msg;
    }
}