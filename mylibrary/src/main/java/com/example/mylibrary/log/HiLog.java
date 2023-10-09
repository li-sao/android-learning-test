package com.example.mylibrary.log;

import static java.lang.Math.log;

import androidx.annotation.NonNull;

/**
 * Tips:
 * 1. 打印堆栈信息
 * 2. File输出
 * 3. 模拟控制台
 */
public class HiLog {
    private  static final String HI_LOG_PACKAGE ;

    static {
        String className = HiLog.class.getName();
        HI_LOG_PACKAGE = className.substring(0,className.lastIndexOf('.')+1);
    }
    public static void v(Object ... contents){
        log(HiLogType.V, contents);
    }

    public static void vt(String tag ,Object ... contents){
        log(HiLogType.V,tag, contents);
    }

    public static void d(Object... contents){
        log(HiLogType.D, contents);
    }
    public static void dt(String tag, Object... contents)
    {
        log(HiLogType.D,tag,contents);
    }
    public static void w(Object... contents){
        log(HiLogType.W, contents);
    }
    public static void wt(String tag, Object... contents)
    {
        log(HiLogType.W,tag,contents);
    }
    public static void e(Object... contents){
        log(HiLogType.E, contents);
    }
    public static void et(String tag, Object... contents)
    {
        log(HiLogType.E,tag,contents);
    }
    public static void i(Object... contents){
        log(HiLogType.I, contents);
    }
    public static void it(String tag, Object... contents)
    {
        log(HiLogType.I,tag,contents);
    }
    public static void a(Object... contents){
        log(HiLogType.A, contents);
    }
    public static void at(String tag, Object... contents)
    {
        log(HiLogType.A,tag,contents);
    }


  //对Log方法重写
    public static void log(@HiLogType.TYPE int type, Object ... contents) {
    }

    public static void log(@HiLogType.TYPE int type,@NonNull String tag, Object ... contents) {
    }


}