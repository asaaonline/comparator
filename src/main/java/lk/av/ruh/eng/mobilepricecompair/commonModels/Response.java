package lk.av.ruh.eng.mobilepricecompair.commonModels;

import java.io.Serializable;

public class Response implements Serializable {

    private String status;
    private Object result;

    public Response(String status, Object result) {
        this.status = status;
        this.result = result;
    }

    public Response() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
