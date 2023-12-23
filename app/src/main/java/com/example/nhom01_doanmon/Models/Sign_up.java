package com.example.nhom01_doanmon.Models;

public class Sign_up {

    public Sign_up(String userName, String passWord, String phoneNumber) {
        UserName = userName;
        PassWord = passWord;
        PhoneNumber = phoneNumber;
    }

    public String UserName;
    public String PassWord;
    public String PhoneNumber;


    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }


}
