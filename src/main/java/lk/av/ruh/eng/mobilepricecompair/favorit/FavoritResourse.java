package lk.av.ruh.eng.mobilepricecompair.favorit;

import java.util.List;

public interface FavoritResourse {
    void setUser(String userId);

    List<FavoriteEntity> getFavorite();

    void setPhoneId(Long phoneId);

    boolean addToFavorite();
}
