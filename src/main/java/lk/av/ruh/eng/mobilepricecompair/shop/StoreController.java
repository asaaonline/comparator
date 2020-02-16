package lk.av.ruh.eng.mobilepricecompair.shop;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("StoreApi")
public class StoreController {

    @PostMapping("addStore")
    public ResponseEntity<Response> addStore(
            @RequestBody StoreRequest storeRequest
    ) {
        return null;
    }

    @PutMapping("{id}/addPhone")
    public ResponseEntity<Response> addPhone(
            @PathVariable String id,
            @RequestBody PhonePriceDTO phonePriceDTO
    ) {
        return null;
    }

    @PutMapping("{id}/EditPhone")
    public ResponseEntity<Response> editPhone(
            @PathVariable String id,
            @RequestBody PhonePriceDTO phonePriceDTO
    ) {
        return null;
    }

}
