package lk.av.ruh.eng.mobilepricecompair.shop;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {
    @Autowired
    private StoreResourse storeResourse;
    private StoreRequest storeRequest;
    @Override
    public void addStoreReqiest(StoreRequest storeRequest) {
        this.storeRequest=storeRequest;
    }

    @Override
    public Response save() {
        storeResourse.setStoreRequest(this.storeRequest);
        StoreEntity save = storeResourse.save();

        return new Response("Sucessfull",save);
    }
}
