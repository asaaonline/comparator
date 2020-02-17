package lk.av.ruh.eng.mobilepricecompair.favorit;

import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;

public interface FavoritService {
    void setUser(String userId);

    Response getFavorite();

}
