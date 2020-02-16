package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PhoneServiceImpl implements PhoneService {
    private String phoneId;

    @Autowired
    private PhoneResourse phoneResourse;


    @Override
    public void setPhoneId(String id) {
        this.phoneId = id;
    }

    @Override
    public Response getPhone() {
        try {
            phoneResourse.setId(this.phoneId);
            PhoneEntity phoneDetails = phoneResourse.getPhone();
            phoneResourse.setId(this.phoneId);
            List<ShopQtyPriceDTO> pricessEachShop = phoneResourse.getPricessEachShop();

            List<Object>objects=new ArrayList<>();

            objects.add(pricessEachShop);
            objects.add(phoneDetails);
            return new Response("Success", objects);
        } catch (Exception e) {
            return new Response("failed", e.toString());
        }

    }
}
