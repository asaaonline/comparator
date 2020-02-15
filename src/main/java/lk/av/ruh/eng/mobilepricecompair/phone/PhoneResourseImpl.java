package lk.av.ruh.eng.mobilepricecompair.phone;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class PhoneResourseImpl implements PhoneResourse {

    private String phoneId;

    @Autowired
    private PhoneRepo phoneRepo;

    @Override
    public void setId(String phoneId) {
        this.phoneId = phoneId;
    }

    @Override
    public PhoneEntity getPhone() {
        Optional<PhoneEntity> byId = phoneRepo.findById(Long.parseLong(phoneId));

        return byId.get();
    }

    public List<ShopQtyPriceDTO> getPricessEachShop() {
        List<Map<String, Object>> storeEntitiesBy = phoneRepo.findStoreEntitiesBy(Long.parseLong(this.phoneId));
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
