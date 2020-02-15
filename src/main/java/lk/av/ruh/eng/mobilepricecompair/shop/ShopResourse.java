package lk.av.ruh.eng.mobilepricecompair.shop;

import lk.av.ruh.eng.mobilepricecompair.phone.ShopQtyPriceDTO;

import java.util.List;

public interface ShopResourse {
    void setPhoneId(String phoneId);

    List<ShopQtyPriceDTO> getPricessEachShop();
}
