package lk.av.ruh.eng.mobilepricecompair.searchMobile;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import lk.av.ruh.eng.mobilepricecompair.phone.PhoneEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {
    private String searchParam;

    @Autowired
    private SearchResource searchResource;

    @Override
    public void setPhoneName(String name) {
        this.searchParam = name;
    }

    @Override
    public Response search() {
        try {
            searchResource.setSearchParam(this.searchParam);
            List<PhoneEntity> search = searchResource.search();
            return new Response("Success",search);
        }
        catch (Exception e){
       return new Response("Fail",e.toString());
        }

    }
}
