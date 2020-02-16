package lk.av.ruh.eng.mobilepricecompair.shop;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;

public interface StoreService {
    void addStoreReqiest(StoreRequest storeRequest);

    Response save();
}
