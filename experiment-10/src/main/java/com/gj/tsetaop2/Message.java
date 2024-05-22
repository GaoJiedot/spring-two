package com.gj.tsetaop2;
import java.util.Date;
public class Message {
    private String className;
    private  String methodName;
    private Date recodeTime;
    private String expendtionMsg;
    public String getClassName(String name) {
        return className;
    }
    public void setClassName(String className) {
        this.className = className;
    }
    public String getMethodName(String name) {
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
    public String getExpendtionMsg() {
        return expendtionMsg;
    }
    public void setExpendtionMsg(String expendtionMsg) {
        this.expendtionMsg = expendtionMsg;
    }
    public String getClassName() {
        return className;
    }
    public String getMethodName() {
        return methodName;
    }
    public void setExpendTionMsg(String msg) {
    }
    @Override
    public String toString() {
        return "Message{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", recodeTime=" + recodeTime +
                ", expendtionMsg='" + expendtionMsg + '\'' +
                '}';
    }
}
