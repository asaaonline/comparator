package lk.av.ruh.eng.mobilepricecompair.searchMobile;

import lk.av.ruh.eng.mobilepricecompair.phone.PhoneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchResourceImpl implements SearchResource {

    @Autowired
    private PhoneRepo phoneRepo;

    private String searchParam;


    @Override
    public void setSearchParam(String searchParam) {
        this.searchParam = searchParam;
    }

    @Override
    public List<PhoneEntity> search() {

     return phoneRepo.findByNameContaining(this.searchParam);


    }
}
