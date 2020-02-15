package lk.av.ruh.eng.mobilepricecompair.searchMobile;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.http.HttpStatus;

public interface SearchService {
    void setPhoneName(String name);

    Response search();
}
