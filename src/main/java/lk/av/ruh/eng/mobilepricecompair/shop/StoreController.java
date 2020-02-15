package lk.av.ruh.eng.mobilepricecompair.shop;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("StoreApi")
public class StoreController {

    @PostMapping("add")
    public ResponseEntity<Response> addStore(
            @RequestBody ShopRequest shopRequest
    ){
        return null;
    }
}
