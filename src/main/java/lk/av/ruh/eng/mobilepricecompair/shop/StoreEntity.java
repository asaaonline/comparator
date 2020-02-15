package lk.av.ruh.eng.mobilepricecompair.shop;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StoreEntity {

    @Id
    private Long id;
    private String name;
    private String address;
    private String tell;

    public StoreEntity(Long id, String name, String address, String tell) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.tell = tell;
    }

    public StoreEntity() {
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
}
