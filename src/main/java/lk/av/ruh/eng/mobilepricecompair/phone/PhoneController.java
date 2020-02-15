package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController("phone")
public class PhoneController {


    @GetMapping("getById/{id}")
    public ResponseEntity<Response> getPhoneById(
            @PathVariable String id
    ) {
        return null;
    }

    @PutMapping("save")
    public ResponseEntity<Response> addNewPhone(
            @RequestBody PhoneDTO phoneDTO
    ) {
        return null;
    }

}
