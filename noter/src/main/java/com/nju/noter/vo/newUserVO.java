package com.nju.noter.vo;

public class newUserVO {
    String mail;
    String userName;
    String password;

    public newUserVO(String mail, String userName, String password) {
        this.mail = mail;
        this.userName = userName;
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
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
}
