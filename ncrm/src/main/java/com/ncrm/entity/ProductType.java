package com.ncrm.entity;

public class ProductType {
    private Integer id;

    private String proTypeName;

    private String proTypeDesc;

    private Integer status;

    private Integer loginId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProTypeName() {
        return proTypeName;
    }

    public void setProTypeName(String proTypeName) {
        this.proTypeName = proTypeName == null ? null : proTypeName.trim();
    }

    public String getProTypeDesc() {
        return proTypeDesc;
    }

    public void setProTypeDesc(String proTypeDesc) {
        this.proTypeDesc = proTypeDesc == null ? null : proTypeDesc.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }
}