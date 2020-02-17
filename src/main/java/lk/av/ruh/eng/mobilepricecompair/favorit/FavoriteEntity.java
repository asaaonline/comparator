package lk.av.ruh.eng.mobilepricecompair.favorit;

import lk.av.ruh.eng.mobilepricecompair.authentication.UserEntity;
import lk.av.ruh.eng.mobilepricecompair.phone.PhoneEntity;

import javax.persistence.*;

@Entity
public class FavoriteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne
    private UserEntity userEntity;
    @OneToOne
    private PhoneEntity phoneEntity;

    public FavoriteEntity(Long id, UserEntity userEntity, PhoneEntity phoneEntity) {
        this.id = id;
        this.userEntity = userEntity;
        this.phoneEntity = phoneEntity;
    }

    public FavoriteEntity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }

    public PhoneEntity getPhoneEntity() {
        return phoneEntity;
    }

    public void setPhoneEntity(PhoneEntity phoneEntity) {
        this.phoneEntity = phoneEntity;
    }
}
