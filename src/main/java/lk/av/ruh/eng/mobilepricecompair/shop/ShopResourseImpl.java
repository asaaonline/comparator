package lk.av.ruh.eng.mobilepricecompair.shop;

import com.fasterxml.jackson.databind.ObjectMapper;
import lk.av.ruh.eng.mobilepricecompair.phone.ShopQtyPriceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class ShopResourseImpl implements ShopResourse {

    private String phoneId;
    @Autowired
    private StoreRepo storeRepo;

    @Override
    public void setPhoneId(String phoneId) {
        this.phoneId = phoneId;

    }

    @Override
    public  List<ShopQtyPriceDTO> getPricessEachShop() {
        List<Map<String, Object>> storeEntitiesBy = storeRepo.findStoreEntitiesBy(Long.parseLong(this.phoneId));
        List<ShopQtyPriceDTO> shopQtyPriceDTOS=new ArrayList<>();
        for (Map<String,Object> stringObjectMap:
             storeEntitiesBy) {
             ObjectMapper mapper = new ObjectMapper(); // jackson's objectmapper
            ShopQtyPriceDTO pojo = mapper.convertValue(stringObjectMap, ShopQtyPriceDTO.class);
            shopQtyPriceDTOS.add(pojo);
        }

        return shopQtyPriceDTOS;
    }
}
