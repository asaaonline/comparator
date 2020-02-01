package lk.av.ruh.eng.mobilepricecompair.authentication;

import org.springframework.data.repository.CrudRepository;

public interface AuthRepo extends CrudRepository<UserEntity,Long> {
    UserEntity getUserEntitiesByName(String name);
}
