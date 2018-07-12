package com.snow.freedomarmy.admin.app.exception;

/* 				    
 **********************************************
 *      DATE           PERSON       REASON
 *    2018/7/13          FXY        Created
 **********************************************
 */


/**
 * 带错误码的异常
 * 1001 插入数据异常
 * 1002 更新数据异常
 * 1003 删除数据异常
 * <p/>
 * 1100 数据库异常
 * <p/>
 * 5000 其余异常
 */
public class RemarkException extends Exception {

    //错误码
    private int code;
    //数据操作错误信息
    private String msg;
    //详细的堆栈信息
    private String error;

    public RemarkException(int code) {
        this.code = code;
    }

    public RemarkException(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public RemarkException() {
    }

    public RemarkException(int code, String msg, String error) {

        this.code = code;
        this.msg = msg;
        this.error = error;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return "RemarkException{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", error='" + error + '\'' +
                '}';
    }
}
