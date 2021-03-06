package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import lk.av.ruh.eng.mobilepricecompair.shop.StoreItemPriceEntity;
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
            phoneResourse.setPhoneEntity(phoneDetails);
            ArrayList<Object> pricessEachShop = phoneResourse.getPricessEachShop();


            return new Response("Success", pricessEachShop);
        } catch (Exception e) {
            return new Response("failed", e.toString());
        }

    }
}
