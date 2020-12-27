package com.sky.domain;

public class User {
    private Integer id;
    private String username;
    private String password;
    private String name;
    private Integer age;
    private String idCard;
    private String bankcard;
    private String balance;
    private Integer roleId;

    public User() {
    }

    public User(Integer id, String username, String password, String name, Integer age, String idCard, String bankcard, String balance, Integer roleId) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.name = name;
        this.age = age;
        this.idCard = idCard;
        this.bankcard = bankcard;
        this.balance = balance;
        this.roleId = roleId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", idCard='" + idCard + '\'' +
                ", bankcard='" + bankcard + '\'' +
                ", balance='" + balance + '\'' +
                ", roleId=" + roleId +
                '}';
    }
}
