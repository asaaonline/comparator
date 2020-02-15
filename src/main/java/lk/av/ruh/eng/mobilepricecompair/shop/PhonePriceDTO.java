
package lk.av.ruh.eng.mobilepricecompair.shop;

import java.io.Serializable;

public class PhonePriceDTO implements Serializable {
    private Long phoneId;
    private Double price;

    public PhonePriceDTO() {
    }

    public PhonePriceDTO(Long phoneId, Double price) {
        this.phoneId = phoneId;
        this.price = price;
    }

    public Long getPhoneId() {
        return phoneId;
    }

    public void setPhoneId(Long phoneId) {
        this.phoneId = phoneId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}

