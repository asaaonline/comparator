package lk.av.ruh.eng.mobilepricecompair.shop;

import java.io.Serializable;

public class StoreRequest implements Serializable {
    private String name;
    private String address;
    private String tell;

    public StoreRequest() {
    }

    public StoreRequest(String name, String address, String tell) {
        this.name = name;
        this.address = address;
        this.tell = tell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }
}
