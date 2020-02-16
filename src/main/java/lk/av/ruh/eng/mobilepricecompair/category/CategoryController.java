package lk.av.ruh.eng.mobilepricecompair.category;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@CrossOrigin("*")
@RequestMapping("category")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;
    @GetMapping("get")
    private ResponseEntity<Response> getCategory(
    ){

        return new ResponseEntity<Response>(categoryService.get(), HttpStatus.ACCEPTED);
    }
}
