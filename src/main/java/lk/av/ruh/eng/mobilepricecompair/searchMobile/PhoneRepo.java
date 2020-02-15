package lk.av.ruh.eng.mobilepricecompair.searchMobile;

import lk.av.ruh.eng.mobilepricecompair.phone.PhoneEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Set;

public interface PhoneRepo extends CrudRepository<PhoneEntity,Long> {
    List<PhoneEntity> findByName(String name);
}
