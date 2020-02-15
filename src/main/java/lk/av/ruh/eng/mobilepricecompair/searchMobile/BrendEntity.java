package lk.av.ruh.eng.mobilepricecompair.searchMobile;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BrendEntity {
    @Id
    private Long id;
    private String brandName;

    public BrendEntity(Long id, String brandName) {
        this.id = id;
        this.brandName = brandName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
