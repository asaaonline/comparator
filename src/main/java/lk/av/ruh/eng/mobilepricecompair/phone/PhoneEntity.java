package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.searchMobile.BrendEntity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.xml.soap.SAAJResult;

@Entity
public class PhoneEntity {
    @Id
    private Long id;
    private String name;
    @ManyToOne(fetch = FetchType.LAZY)
    private BrendEntity brand;
    private float primaryCamera;
    private float secondryCam;
    private float prosesorSpeed;
    private float ram;

    public PhoneEntity(Long id, String name, BrendEntity brand, float primaryCamera, float secondryCam, float prosesorSpeed, float ram) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.primaryCamera = primaryCamera;
        this.secondryCam = secondryCam;
        this.prosesorSpeed = prosesorSpeed;
        this.ram = ram;
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

    public BrendEntity getBrand() {
        return brand;
    }

    public void setBrand(BrendEntity brand) {
        this.brand = brand;
    }

    public float getPrimaryCamera() {
        return primaryCamera;
    }

    public void setPrimaryCamera(float primaryCamera) {
        this.primaryCamera = primaryCamera;
    }

    public float getSecondryCam() {
        return secondryCam;
    }

    public void setSecondryCam(float secondryCam) {
        this.secondryCam = secondryCam;
    }

    public float getProsesorSpeed() {
        return prosesorSpeed;
    }

    public void setProsesorSpeed(float prosesorSpeed) {
        this.prosesorSpeed = prosesorSpeed;
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }
}
