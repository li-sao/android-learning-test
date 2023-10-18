package com.example.mylibrary.log;

import androidx.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

public class HiLogManager {

    private  HiLogConfig config;

    //region ==========实现管理类的单列=========
    private  static HiLogManager instance;

    private HiLogManager(HiLogConfig config){
        this.config = config;
    }

    public static HiLogManager getInstance(){
        return instance;
    }

    public static void init(@NotNull HiLogConfig config){
        instance = new HiLogManager(config);
    }
    //endregion

    public HiLogConfig getConfig(){
        return config;
    }



}
