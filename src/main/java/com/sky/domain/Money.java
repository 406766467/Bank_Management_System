package com.sky.domain;

public class Money {
    private Integer id;
    private String bankcard;
    private String name;
    private String money;
    private String cktime;
    private String state;

    public Money() {}

    public Money(Integer id, String bankcard, String name, String money, String cktime, String state) {
        this.id = id;
        this.bankcard = bankcard;
        this.name = name;
        this.money = money;
        this.cktime = cktime;
        this.state = state;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getCktime() {
        return cktime;
    }

    public void setCktime(String cktime) {
        this.cktime = cktime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Money{" +
                "id=" + id +
                ", bankcard='" + bankcard + '\'' +
                ", name='" + name + '\'' +
                ", money='" + money + '\'' +
                ", cktime='" + cktime + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
