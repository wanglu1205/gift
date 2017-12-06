package com.wanglu.movcat.exception;

/**
 * Created by wangl on 2017/10/16 0016.
 */

public class MacroApiException extends RuntimeException {

    public MacroApiException(){
        super();
    }

    public MacroApiException(String msg){
        super(msg);
    }
    public MacroApiException(String msg, Throwable e){
        super(msg, e);
    }
}

