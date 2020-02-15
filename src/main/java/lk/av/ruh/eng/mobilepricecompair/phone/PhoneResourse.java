package lk.av.ruh.eng.mobilepricecompair.phone;

import java.util.List;

public interface PhoneResourse {
    void setId(String phoneId);

    PhoneEntity getPhone();
    List<ShopQtyPriceDTO> getPricessEachShop();


}
