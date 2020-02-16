package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.shop.StoreItemPriceEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhonePriceRepo extends CrudRepository<StoreItemPriceEntity,Long> {
    List<StoreItemPriceEntity> findStoreItemPriceEntitiesByPhoneEntity(PhoneEntity phoneEntity);
}
