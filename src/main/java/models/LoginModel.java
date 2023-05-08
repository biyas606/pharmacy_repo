package models;

public class LoginModel {
    String userName;
    String password;

    public LoginModel() {
    }

    public LoginModel(String userName, String password) {
        this.userName = userName;
        password = password;
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
        password = password;
    }
}
