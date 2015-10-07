package com.alexey.podolian;

import android.util.Log;

public final class Logger {
    private Logger() {}

    static boolean isDebug = true;
    static final String tag = "test :";

    public static void setDebugMode(boolean isDebug) {
        Logger.isDebug = isDebug;
    }

    public static void d(String msg) {
        d(tag, msg);
    }

    public static void i(String msg) {
        i(tag, msg);
    }

    public static void w(String msg) {
        w(tag, msg);
    }

    public static void e(String msg) {
        e(tag, msg);
    }

    public static void w(Throwable tr) {
        w(tag, tr);
    }

    public static void d(String tag, String msg) {
        if (isDebug) Log.d(tag, msg);
    }

    public static void i(String tag, String msg) {
        if (isDebug) Log.i(tag, msg);
    }

    public static void w(String tag, String msg) {
        if (isDebug) Log.w(tag, msg);
    }

    public static void e(String tag, String msg) {
        if (isDebug) Log.e(tag, msg);
    }

    public static void w(String tag, Throwable tr) {
        if (isDebug) Log.w(tag, tr);
    }
}
