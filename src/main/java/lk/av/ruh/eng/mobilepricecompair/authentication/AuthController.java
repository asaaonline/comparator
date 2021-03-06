package lk.av.ruh.eng.mobilepricecompair.authentication;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("auth")
@Controller
@CrossOrigin("*")
public class AuthController {

    @Autowired
    AuthResources authResources;

    @PostMapping("login")
    public ResponseEntity<Response> login(
            @RequestBody LoginUser loginUser
    ) {
        return new ResponseEntity<Response>(
                authResources.login(loginUser),
                HttpStatus.ACCEPTED);
    }

    @PostMapping("register")
    public ResponseEntity<Response> register(
            @RequestBody UserDto userDTO
    ) {
        return new ResponseEntity<Response>(authResources.register(userDTO), HttpStatus.ACCEPTED);
    }
}

