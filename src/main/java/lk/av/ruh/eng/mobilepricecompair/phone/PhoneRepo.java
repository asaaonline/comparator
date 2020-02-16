package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.shop.StoreItemPriceEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface PhoneRepo extends CrudRepository<PhoneEntity,Long> {
    List<PhoneEntity> findByNameContaining(String name);


}
