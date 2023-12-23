package com.example.nhom01_doanmon.Models;

public class Sign_in {

    public String Username;
    public String Password;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public Sign_in(String username, String password) {
        Username = username;
        Password = password;
    }
}
