package com.example.androidtest1

import android.app.Application
import com.example.mylibrary.log.HiLogConfig
import com.example.mylibrary.log.HiLogManager
import java.util.Objects

class MApplication: Application(){
    override fun onCreate() {
        super.onCreate()
        HiLogManager.init(object :HiLogConfig(){
            //定义全局的tag
            override fun getGlobalTag(): String {
                return "MApplication"
            }
            //启用
            override fun enable(): Boolean {
                return true
            }
        })
    }
}