package lk.av.ruh.eng.mobilepricecompair.authentication;

import lk.av.ruh.eng.mobilepricecompair.phone.PhoneEntity;

import javax.persistence.*;
import java.util.List;

@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String tel;
    private String address;
    private String password;
    private String email;
    @OneToMany
    private List<PhoneEntity> favorites;

    public UserEntity() {
    }

    public UserEntity(String name, String tel, String address, String password, String email, List<PhoneEntity> favorites) {
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.password = password;
        this.email = email;
        this.favorites = favorites;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<PhoneEntity> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<PhoneEntity> favorites) {
        this.favorites = favorites;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
