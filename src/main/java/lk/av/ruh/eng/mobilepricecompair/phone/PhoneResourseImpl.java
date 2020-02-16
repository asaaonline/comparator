package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.shop.StoreItemPriceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PhoneResourseImpl implements PhoneResourse {

    private String phoneId;
    private PhoneEntity phoneEntity;
    @Autowired
    private PhonePriceRepo shopQtyPriceDTOS;

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

    public ArrayList<Object> getPricessEachShop() {
        List<StoreItemPriceEntity> storeItemPriceEntitiesByPhoneEntity = shopQtyPriceDTOS.findStoreItemPriceEntitiesByPhoneEntity(this.phoneEntity);


        ArrayList<Object> objects = new ArrayList<>();
        objects.add(this.phoneEntity);
        objects.add(storeItemPriceEntitiesByPhoneEntity);


        return objects;
    }

    @Override
    public void setPhoneEntity(PhoneEntity phoneDetails) {
        this.phoneEntity=phoneDetails;
    }
}
