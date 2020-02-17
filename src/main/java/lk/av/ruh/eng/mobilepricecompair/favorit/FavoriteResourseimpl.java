package lk.av.ruh.eng.mobilepricecompair.favorit;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoriteResourseimpl implements FavoritResourse {
    private String userId;
    @Autowired
    private FavoriteRepo favoriteRepo;

    @Override
    public void setUser(String userId) {
        this.userId = userId;
    }

    @Override
    public List<FavoriteEntity> getFavorite() {
        return favoriteRepo.findFavoriteEntitiesByUserEntityId(this.userId);

    }
}
