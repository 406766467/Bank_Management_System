package com.sky.domain;

public class RoleFunction {
    private Integer id;
    private Integer roleId;
    private String function;
    private String url;

    public RoleFunction() {
    }

    public RoleFunction(Integer id, Integer roleId, String function, String url) {
        this.id = id;
        this.roleId = roleId;
        this.function = function;
        this.url = url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "RoleFunction{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", function='" + function + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
