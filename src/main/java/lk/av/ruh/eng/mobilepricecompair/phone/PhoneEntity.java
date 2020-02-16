package lk.av.ruh.eng.mobilepricecompair.phone;

import lk.av.ruh.eng.mobilepricecompair.category.BrandEntity;

import javax.persistence.*;

@Entity
public class PhoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @ManyToOne
    private BrandEntity brand;
    private float primaryCamera;
    private float secondryCam;
    private float prosesorSpeed;
    private float ram;
    private String url;

    public PhoneEntity() {
    }

    public PhoneEntity(Long id, String name, BrandEntity brand, float primaryCamera, float secondryCam, float prosesorSpeed, float ram, String url) {
        this.id = id;
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

    public BrandEntity getBrand() {
        return brand;
    }

    public void setBrand(BrandEntity brand) {
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
