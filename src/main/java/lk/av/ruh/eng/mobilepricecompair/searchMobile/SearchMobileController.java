package lk.av.ruh.eng.mobilepricecompair.searchMobile;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("search")
public class SearchMobileController {

    @Autowired
    private SearchService searchService;

    @GetMapping("byName")
    public ResponseEntity<Response> searchByname(
            @RequestParam String searchKeyWord
    ) {

        searchService.setPhoneName(searchKeyWord);
        return new ResponseEntity<Response>(searchService.search(), HttpStatus.ACCEPTED);
    }
}
