package lk.av.ruh.eng.mobilepricecompair.searchMobile;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("search")
public class SearchMobileController {

    public ResponseEntity<Response> searchByname(
            @RequestParam String name
    ){
        return null;
    }
}
