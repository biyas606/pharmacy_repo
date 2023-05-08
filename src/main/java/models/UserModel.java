package models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pharmacy_users")
public class UserModel {

    @Id
    @GeneratedValue
    int userId;

    String name;
    String designation;
    String Address;
    String userName;
    String password;
    String emailId;
    int phone;

    public UserModel() {
    }

    public UserModel(int userId, String name, String designation, String address, String userName, String password, String emailId, int phone) {
        this.userId = userId;
        this.name = name;
        this.designation = designation;
        Address = address;
        this.userName = userName;
        this.password = password;
        this.emailId = emailId;
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }
}
