package lk.av.ruh.eng.mobilepricecompair.favorit;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController("favorit")
public class FavoritController {

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
