/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-04-08 22:01 创建
 */
package demo.exception;


import demo.enums.Status;

/**
 * 自定义的异常
 */
public class DemoException extends RuntimeException {
    private Status status;
    private String description;

    public DemoException(Status status, String description) {
        this.status = status;
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
