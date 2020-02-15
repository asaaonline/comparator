package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhoneServiceImpl implements PhoneService {
    private String phoneId;

    @Autowired
    private PhoneResourse phoneResourse;
    @Override
    public void setPhoneId(String id) {
    this.phoneId=id;
    }

    @Override
    public Response getPhone() {
        try {
            phoneResourse.setId(this.phoneId);
            PhoneEntity phone = phoneResourse.getPhone();
            return new Response("Success",phone);
        }catch (Exception e){
            return new Response("failed",e.toString());
        }

    }
}
