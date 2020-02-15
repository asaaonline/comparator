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
    private StoreEntity storeEntity;
    @OneToOne
    private PhoneEntity phoneEntity;
    private Double price;
    private int quntity;


    public StoreItemPriceEntity(Long id, StoreEntity storeEntity, PhoneEntity phoneEntity, Double price, int quntity) {
        this.id = id;
        this.storeEntity = storeEntity;
        this.phoneEntity = phoneEntity;
        this.price = price;
        this.quntity = quntity;
    }

    public int getQuntity() {
        return quntity;
    }

    public void setQuntity(int quntity) {
        this.quntity = quntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public StoreEntity getStoreEntity() {
        return storeEntity;
    }

    public void setStoreEntity(StoreEntity storeEntity) {
        this.storeEntity = storeEntity;
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
}
