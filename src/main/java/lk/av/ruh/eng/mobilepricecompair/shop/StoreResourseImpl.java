package lk.av.ruh.eng.mobilepricecompair.shop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreResourseImpl implements StoreResourse {

    private StoreRequest storeRequest;
    @Autowired
    private StoreRepo storeRepo;


    @Override
    public void setStoreRequest(StoreRequest storeRequest) {
        this.storeRequest=storeRequest;
    }

    @Override
    public StoreEntity save() {

        return storeRepo.save(new StoreEntity(
                this.storeRequest.getName(),
                this.storeRequest.getAddress(),
                this.storeRequest.getTell(),
                this.storeRequest.getUrl()));

    }
}
