package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.searchMobile.BrendEntity;

import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import java.io.Serializable;

public class PhoneDTO implements Serializable {

    private String name;
    private BrendEntity brand;
    private float primaryCamera;
    private float secondryCam;
    private float prosesorSpeed;
    private float ram;
    private String url;

    public PhoneDTO() {
    }

    public PhoneDTO(String name, BrendEntity brand, float primaryCamera, float secondryCam, float prosesorSpeed, float ram, String url) {
        this.name = name;
        this.brand = brand;
        this.primaryCamera = primaryCamera;
        this.secondryCam = secondryCam;
        this.prosesorSpeed = prosesorSpeed;
        this.ram = ram;
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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
