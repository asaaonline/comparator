package lk.av.ruh.eng.mobilepricecompair.favorit;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavoritServiceImpl implements FavoritService {

    @Autowired
    private FavoritResourse favoritResourse;

    private String userId;

    @Override
    public void setUser(String userId) {
        this.userId = userId;
    }

    @Override
    public Response getFavorite() {
        try {
            favoritResourse.setUser(this.userId);
            List<FavoriteEntity> favoriteEntities = favoritResourse.getFavorite();

            return new Response("successful", favoriteEntities);
        }catch (Exception e){
            return new Response("fail",e.toString());
        }
    }
}
