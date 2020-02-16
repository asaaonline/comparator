package lk.av.ruh.eng.mobilepricecompair.phone;

import java.util.ArrayList;

public interface PhoneResourse {
    void setId(String phoneId);

    PhoneEntity getPhone();
    ArrayList<Object> getPricessEachShop();


    void setPhoneEntity(PhoneEntity phoneDetails);
}
