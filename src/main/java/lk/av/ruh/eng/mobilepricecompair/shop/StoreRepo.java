package lk.av.ruh.eng.mobilepricecompair.shop;

import lk.av.ruh.eng.mobilepricecompair.phone.ShopQtyPriceDTO;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Map;

public interface StoreRepo extends CrudRepository<StoreEntity,Long> {
    @Override
    Iterable<StoreEntity> findAll();


}
