package lk.av.ruh.eng.mobilepricecompair.shop;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class StoreEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique=true)
    private String name;
    private String address;
    private String tell;
    private String imgUrl;
    @OneToMany(fetch = FetchType.LAZY,
            mappedBy = "storeEntity",
            cascade = CascadeType.ALL,
            orphanRemoval = true)
    @JsonIgnore
    private Set<StoreItemPriceEntity> storeItemPriceEntities=new HashSet<>();


    public StoreEntity() {
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public StoreEntity(String name, String address, String tell, String imgUrl, Set<StoreItemPriceEntity> storeItemPriceEntities) {
        this.name = name;
        this.address = address;
        this.tell = tell;
        this.imgUrl = imgUrl;
        this.storeItemPriceEntities = storeItemPriceEntities;
    }

    public StoreEntity(String name, String address, String tell, String imgUrl) {
        this.name = name;
        this.address = address;
        this.tell = tell;
        this.imgUrl = imgUrl;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTell() {
        return tell;
    }

    public void setTell(String tell) {
        this.tell = tell;
    }

    public Set<StoreItemPriceEntity> getStoreItemPriceEntities() {
        return storeItemPriceEntities;
    }

    public void setStoreItemPriceEntities(Set<StoreItemPriceEntity> storeItemPriceEntities) {
        this.storeItemPriceEntities = storeItemPriceEntities;
    }
}
