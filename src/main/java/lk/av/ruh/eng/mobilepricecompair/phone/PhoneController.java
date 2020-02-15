package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController("phone")
public class PhoneController {
    @Autowired
    private PhoneService phoneService;

    @GetMapping("getById/{id}")
    public ResponseEntity<Response> getPhoneById(
            @PathVariable String id
    ) {
        phoneService.setPhoneId(id);
        return new ResponseEntity<Response>(phoneService.getPhone(), HttpStatus.ACCEPTED);
    }

    @PutMapping("save")
    public ResponseEntity<Response> addNewPhone(
            @RequestBody PhoneDTO phoneDTO
    ) {
        return null;
    }

}
