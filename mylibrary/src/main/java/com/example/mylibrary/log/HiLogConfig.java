package com.example.mylibrary.log;

public class HiLogConfig {
    static int MAX_LEN = 512;
    public JsonParser injectJsonParser(){return null;}
    public String getGlobalTag(){return "HiLog";} //默认标记
    public boolean enable(){
        return true;
    } //默认可用的
    public boolean includeThread(){
        return false;
    }
    public int stackTraceDepth(){return 5;}
    public interface JsonParser{
        String toJson(Object src);
    }
}
