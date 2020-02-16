package lk.av.ruh.eng.mobilepricecompair.favorit;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@CrossOrigin("*")
@RequestMapping("favorit")
public class FavoritController {

    @Autowired
    private FavoritService favoritService;

    @PutMapping("add/{uId}")
    public ResponseEntity<Response> makeFavorite(
            @PathVariable String uId,
            @RequestParam Long phoneId
    ) {

        return null;
    }

    @PutMapping("remove/{uId}")
    public ResponseEntity<Response> removeFavorite(
            @PathVariable String uId,
            @RequestParam Long phoneId
    ) {
        return null;
    }

}
