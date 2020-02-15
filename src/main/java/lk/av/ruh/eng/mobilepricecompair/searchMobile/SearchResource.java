package lk.av.ruh.eng.mobilepricecompair.searchMobile;

import lk.av.ruh.eng.mobilepricecompair.phone.PhoneEntity;

import java.util.List;

public interface SearchResource {
    void setSearchParam(String searchParam);

    List<PhoneEntity> search();
}
