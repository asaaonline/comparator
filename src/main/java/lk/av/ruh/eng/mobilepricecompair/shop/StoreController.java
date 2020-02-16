package lk.av.ruh.eng.mobilepricecompair.shop;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("StoreApi")
public class StoreController {
    @Autowired
    private StoreService storeService;

    @PostMapping("addStore")
    public ResponseEntity<Response> addStore(
            @RequestBody StoreRequest storeRequest
    ) {

        storeService.addStoreReqiest(storeRequest);
        return new ResponseEntity<Response>(storeService.save(), HttpStatus.ACCEPTED);
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
