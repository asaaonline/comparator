package lk.av.ruh.eng.mobilepricecompair.searchMobile;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("search")
public class SearchMobileController {

    @Autowired
    private SearchService searchService;

    @GetMapping("byName")
    public ResponseEntity<Response> searchByname(
            @RequestParam String name
    ) {

        searchService.setPhoneName(name);
        return new ResponseEntity<Response>(searchService.search(), HttpStatus.ACCEPTED);
    }
}
