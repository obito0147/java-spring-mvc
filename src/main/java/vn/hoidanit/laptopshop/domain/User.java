package vn.hoidanit.laptopshop.domain;

public class User {
    private long id;
    private String email;
    private String password;
    private String fullName;
    private String address;
    private String phone;

    public User() {
    }

    public User(long id, String email, String password, String fullName, String addresss, String phone) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullName = fullName;
        this.address = addresss;
        this.phone = phone;
    }

    // public void SetId(long id) {
    // this.id = id;
    // }

    // public long GetId() {
    // return id;
    // }

    // public String getEmail() {
    // return email;
    // }

    // public void setEmail(String email) {
    // this.email = email;
    // }

    // public void SetPassword(String password) {
    // this.password = password;
    // }

    // public String GetPassword() {
    // return password;
    // }

    // public void SetFullName(String fullName) {
    // this.fullName = fullName;
    // }

    // public String GetFullName() {
    // return fullName;
    // }

    // public void SetAddress(String address) {
    // this.address = address;
    // }

    // public String GetAddress() {
    // return address;
    // }

    // public void SetPhone(String phone) {
    // this.phone = phone;
    // }

    // public String GetPhone() {
    // return phone;
    // }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "id = " + id + "email = " + email + "password = " + password + "fullname = " + fullName + "address = "
                + address;
    }
}
