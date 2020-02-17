package lk.av.ruh.eng.mobilepricecompair.favorit;

import lk.av.ruh.eng.mobilepricecompair.authentication.AuthRepo;
import lk.av.ruh.eng.mobilepricecompair.authentication.UserEntity;
import lk.av.ruh.eng.mobilepricecompair.commonModels.Response;
import lk.av.ruh.eng.mobilepricecompair.phone.PhoneEntity;
import lk.av.ruh.eng.mobilepricecompair.phone.PhoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class FavoriteResourseimpl implements FavoritResourse {
    private String userId;
    @Autowired
    private FavoriteRepo favoriteRepo;
    @Autowired
    private AuthRepo authRepo;
    @Autowired
    private PhoneRepo phoneRepo;
    private Long phoneId;

    @Override
    public void setUser(String userId) {
        this.userId = userId;
    }

    @Override
    public List<FavoriteEntity> getFavorite() {
        return favoriteRepo.findFavoriteEntitiesByUserEntityId(Long.parseLong(this.userId));

    }

    @Override
    public void setPhoneId(Long phoneId) {
        this.phoneId = phoneId;
    }

    @Override
    public boolean addToFavorite() {
        try {
            Optional<UserEntity> byId1 = authRepo.findById(Long.parseLong(this.userId));
            UserEntity userEntity = byId1.get();
            Optional<PhoneEntity> byId = phoneRepo.findById(phoneId);
            PhoneEntity phoneEntity = byId.get();
            FavoriteEntity save = favoriteRepo.save(new FavoriteEntity(userEntity, phoneEntity));
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
