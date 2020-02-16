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

    @Query(value = "SELECT store_entity.id as id,store_entity.img_url as url,store_entity.address as address,store_entity.NAME as name,store_entity.tell as tell,store_item_price_entity.price as price,store_item_price_entity.quntity as quntity FROM store_entity INNER JOIN store_entity_store_item_price_entities ON store_entity.id=store_entity_store_item_price_entities.store_entity_id\n" +
            "INNER JOIN store_item_price_entity on store_entity_store_item_price_entities.store_item_price_entities_id=store_item_price_entity.id\n" +
            "INNER JOIN phone_entity ON  phone_entity.id=store_item_price_entity.phone_entity_id WHERE phone_entity.id=?1",nativeQuery = true)
    List<Map<String,Object>> findStoreEntitiesBy(Long id);


}
