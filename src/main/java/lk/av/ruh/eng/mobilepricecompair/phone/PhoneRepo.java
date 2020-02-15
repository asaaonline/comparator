package lk.av.ruh.eng.mobilepricecompair.phone;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PhoneRepo extends CrudRepository<PhoneEntity,Long> {
    List<PhoneEntity> findByNameContaining(String name);
}
