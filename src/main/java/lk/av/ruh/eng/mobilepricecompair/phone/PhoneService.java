package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.http.HttpStatus;

public interface PhoneService {
    void setPhoneId(String id);

    Response getPhone();
}
