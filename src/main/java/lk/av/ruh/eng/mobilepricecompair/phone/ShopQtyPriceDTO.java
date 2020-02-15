package lk.av.ruh.eng.mobilepricecompair.phone;

import java.io.Serializable;
import java.math.BigInteger;

public class ShopQtyPriceDTO implements Serializable {

    private BigInteger id;
    private String address;
    private String name;
    private String tell;
    private Double price;
    private int quntity;

    public ShopQtyPriceDTO() {
    }

    public ShopQtyPriceDTO(BigInteger id, String address, String name, String tell, Double price, int quntity) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.tell = tell;
        this.price = price;
        this.quntity = quntity;
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }
}
