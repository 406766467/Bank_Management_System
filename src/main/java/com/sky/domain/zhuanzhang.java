package com.sky.domain;

import javax.persistence.criteria.CriteriaBuilder;

public class zhuanzhang {
    private Integer id;
    private String bankcarda;
    private String bankcardb;
    private String money;
    private String time;

    public zhuanzhang() {}
    public zhuanzhang(Integer id, String bankcarda, String bankcardb, String money, String time) {
        this.id = id;
        this.bankcarda = bankcarda;
        this.bankcardb = bankcardb;
        this.money = money;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBankcarda() {
        return bankcarda;
    }

    public void setBankcarda(String bankcarda) {
        this.bankcarda = bankcarda;
    }

    public String getBankcardb() {
        return bankcardb;
    }

    public void setBankcardb(String bankcardb) {
        this.bankcardb = bankcardb;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "zhuanzhang{" +
                "id=" + id +
                ", bankcarda='" + bankcarda + '\'' +
                ", bankcardb='" + bankcardb + '\'' +
                ", money='" + money + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
