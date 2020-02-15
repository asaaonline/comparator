package lk.av.ruh.eng.mobilepricecompair.phone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
