package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.shop.StoreItemPriceEntity;

import java.util.List;

public interface PhoneResourse {
    void setId(String phoneId);

    PhoneEntity getPhone();
    List<StoreItemPriceEntity> getPricessEachShop();


    void setPhoneEntity(PhoneEntity phoneDetails);
}
