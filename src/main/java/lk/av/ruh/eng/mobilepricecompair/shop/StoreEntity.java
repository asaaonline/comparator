package lk.av.ruh.eng.mobilepricecompair.shop;

import javax.persistence.*;
import java.util.List;

@Entity
public class StoreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(unique=true)
    private String name;
    private String address;
    private String tell;
    private String imgUrl;
    @OneToMany
    private List<StoreItemPriceEntity> storeItemPriceEntities;


    public StoreEntity() {
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public StoreEntity(Long id, String name, String address, String tell, String imgUrl, List<StoreItemPriceEntity> storeItemPriceEntities) {
        this.id = id;
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

    public List<StoreItemPriceEntity> getStoreItemPriceEntities() {
        return storeItemPriceEntities;
    }

    public void setStoreItemPriceEntities(List<StoreItemPriceEntity> storeItemPriceEntities) {
        this.storeItemPriceEntities = storeItemPriceEntities;
    }
}
