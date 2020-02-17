package lk.av.ruh.eng.mobilepricecompair.favorit;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FavoriteRepo extends CrudRepository<FavoriteEntity, Long> {
    List<FavoriteEntity> findFavoriteEntitiesByUserEntityId(String id);
}
