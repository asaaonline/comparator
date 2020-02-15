package lk.av.ruh.eng.mobilepricecompair.shop;

import lk.av.ruh.eng.mobilepricecompair.phone.PhoneEntity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class StoreItemPriceEntity {
    @Id
    private Long id;
    @OneToOne
    private PhoneEntity phoneEntity;
    private Double price;
    private int quntity;

    public StoreItemPriceEntity(Long id, PhoneEntity phoneEntity, Double price, int quntity) {
        this.id = id;
        this.phoneEntity = phoneEntity;
        this.price = price;
        this.quntity = quntity;
    }

    public StoreItemPriceEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PhoneEntity getPhoneEntity() {
        return phoneEntity;
    }

    public void setPhoneEntity(PhoneEntity phoneEntity) {
        this.phoneEntity = phoneEntity;
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
