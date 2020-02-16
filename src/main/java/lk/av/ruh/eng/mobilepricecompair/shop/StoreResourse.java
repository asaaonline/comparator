package lk.av.ruh.eng.mobilepricecompair.shop;

import lk.av.ruh.eng.mobilepricecompair.phone.ShopQtyPriceDTO;

import java.util.List;

public interface StoreResourse {


    void setStoreRequest(StoreRequest storeRequest);

    StoreEntity save();
}
