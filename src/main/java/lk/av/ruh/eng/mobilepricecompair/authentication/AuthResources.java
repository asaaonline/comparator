package lk.av.ruh.eng.mobilepricecompair.authentication;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.http.HttpStatus;

public interface AuthResources  {
    Response login(String userName, String password);
}
