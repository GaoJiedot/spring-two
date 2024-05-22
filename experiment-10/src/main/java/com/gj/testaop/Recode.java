package com.gj.testaop;


import java.util.Date;

public class Recode {
    private String className;
    private  String methodName;
    private Date recodeTime;
    private Long expendTime;


    @Override
    public String toString() {
        return "Recode{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", recodeTime=" + recodeTime +
                ", expendTime=" + expendTime +
                '}';
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Date getRecodeTime() {
        return recodeTime;
    }

    public void setRecodeTime(Date recodeTime) {
        this.recodeTime = recodeTime;
    }

    public Long getExpendTime() {
        return expendTime;
    }

    public void setExpendTime(Long expendTime) {
        this.expendTime = expendTime;
    }
}
