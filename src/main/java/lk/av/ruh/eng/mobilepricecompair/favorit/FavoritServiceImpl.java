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
    private Long phoneId;

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

    @Override
    public void setPhoneId(Long phoneId) {
        this.phoneId=phoneId;
    }

    @Override
    public Response addToFavorite() {
        try {
            favoritResourse.setUser(this.userId);
            favoritResourse.setPhoneId(this.phoneId);
            boolean b = favoritResourse.addToFavorite();
            return new Response("successful",b);

        }
        catch (Exception e){
            return new Response("false",e.toString());
        }
         }
}
