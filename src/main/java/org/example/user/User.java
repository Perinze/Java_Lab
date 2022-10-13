package org.example.user;

public class User {
    String name;
    String password;
    int gender;
    String tel;
    String email;

    public User(String name, String password, int gender, String tel, String email) {
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.tel = tel;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", tel='" + tel + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
