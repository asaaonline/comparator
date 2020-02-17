package lk.av.ruh.eng.mobilepricecompair.favorit;

import lk.av.ruh.eng.mobilepricecompair.authentication.UserEntity;
import lk.av.ruh.eng.mobilepricecompair.phone.PhoneEntity;

import javax.persistence.*;

@Entity
@Table(
        uniqueConstraints = {@UniqueConstraint(columnNames = {"user_entity_id", "phone_entity_id"})}
)
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

    public FavoriteEntity(UserEntity userEntity, PhoneEntity phoneEntity) {
        this.userEntity = userEntity;
        this.phoneEntity = phoneEntity;
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
