package com.example.mylibrary.log;

public abstract class HiLogConfig {
    //使用默认的TAG
    public String getGlobalTag(){
        return "HiLog";
    }
    //默认启用hilog
    public boolean enable(){
        return true;
    }
}
