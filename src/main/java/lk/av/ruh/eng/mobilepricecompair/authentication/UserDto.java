package lk.av.ruh.eng.mobilepricecompair.authentication;

public class UserDto {

    private String name;
    private String tel;
    private String address;
    private String password;


    public UserDto() {
    }

    public UserDto(String name, String tel, String address, String password) {
        this.name = name;
        this.tel = tel;
        this.address = address;
        this.password = password;
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
