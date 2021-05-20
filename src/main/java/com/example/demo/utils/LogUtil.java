package com.example.demo.utils;

import lombok.extern.slf4j.Slf4j;

import java.text.MessageFormat;
import java.util.StringTokenizer;

@Slf4j
public class LogUtil {

    public static ThreadLocal<String> REQUEST_ID = ThreadLocal.withInitial(() -> "");

    private static final String LOG_TYPE_REQUEST = "req"; // api请求
    private static final String LOG_TYPE_RESPONSE = "res"; // api响应
    private static final String LOG_TYPE_USER_WARN = "warn"; // 用户输入导致的异常
    private static final String LOG_TYPE_SYS_ERROR = "err"; // 系统异常
    private static final String LOG_TYPE_DEBUG = "dbg"; // debug调试
    private static final String LOG_TYPE_INFO = "info"; // info信息

    private static final int LOG_LVL_ERROR = 0;
    private static final int LOG_LVL_WARN  = 1;
    private static final int LOG_LVL_INFO  = 2;
    private static final int LOG_LVL_DEBUG = 3;
    private static final int LOG_LVL_TRACE = 4;

    private static final int LOG_LVL_CURRENT = LOG_LVL_DEBUG;

    public static void warn(String traceId,String format,Object... args){
        if (isPermitted(LOG_LVL_WARN)) {
            messagePrint(LOG_TYPE_USER_WARN,traceId,format,args);
        }
    }

    public static void warn(String format,Object... args){
        warn(null,format,args);
    }

    public static void error(String traceId,String format,Object... args){
        if (isPermitted(LOG_LVL_ERROR)) {
            messagePrint(LOG_TYPE_SYS_ERROR,traceId,format,args);
        }
    }

    public static void error(String format,Object... args){
        error(null,format,args);
    }

    public static void debug(String traceId,String format,Object... args){
        if (isPermitted(LOG_LVL_DEBUG)) {
            messagePrint(LOG_TYPE_DEBUG,traceId,format,args);
        }
    }

    public static void debug(String format,Object... args){
        debug(null,format,args);
    }

    public static void info(String traceId,String format,Object... args){
        if (isPermitted(LOG_LVL_INFO)) {
            messagePrint(LOG_TYPE_INFO,traceId,format,args);
        }
    }

    public static void info(String format,Object... args){
        info(null,format,args);
    }

    private static void messagePrint(String type,String traceId,String format,Object... args){
        String requestId = REQUEST_ID.get();
        String msg;
        try {
            msg = MessageFormat.format("{0}|{1}|{2}",requestId == null ? "" : requestId,
                    traceId != null ? traceId : "",
                    format != null ? MessageFormat.format(format,args) : "");
        } catch (Exception e) {
            StringBuilder argsStr = new StringBuilder();
            argsStr.append(format);
            for (int i = 0; i < args.length; i++) {
                Object arg = args[i];
                if (arg != null) {
                    argsStr.append("\t").append(i).append("-----").append(arg.toString());
                }
            }
            msg = MessageFormat.format("{0}|{1}|{2}",requestId == null ? "" : requestId,
                    traceId != null ? traceId : "",
                    argsStr.toString());
        }

        Throwable t = null;
        if (args.length > 0 && (args[args.length-1] instanceof Throwable)) {
            t = (Throwable) args[args.length - 1];
        }

        if (LOG_TYPE_USER_WARN.equals(type)) {
            log.warn(msg,t);
        } else if (LOG_TYPE_SYS_ERROR.equals(type)) {
            log.error(msg,t);
        } else if (LOG_TYPE_DEBUG.equals(type)) {
            log.debug(msg,t);
        } else if (LOG_TYPE_REQUEST.equals(type) || LOG_TYPE_RESPONSE.equals(type) || LOG_TYPE_INFO.equals(type)) {
            log.info(msg,t);
        }
    }


    private static boolean isPermitted(int level){
        return LOG_LVL_CURRENT >= level;
    }
}
