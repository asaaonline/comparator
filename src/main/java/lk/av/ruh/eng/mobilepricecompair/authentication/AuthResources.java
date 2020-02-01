package lk.av.ruh.eng.mobilepricecompair.authentication;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.http.HttpStatus;

public interface AuthResources  {
    Response login(LoginUser loginUser);

    Response register(UserDto userDTO);
}
