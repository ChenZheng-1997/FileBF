package com.domain;

import javax.persistence.Id;

public class Supplier {

    @Id
    private Integer id;

    private String suppliername;

    private String supplierpeople;

    private Integer suppliermoney;

    private String supplieraddress;

    private String tel;

    private Integer sign;

    private String explains;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSuppliername() {
        return suppliername;
    }

    public void setSuppliername(String suppliername) {
        this.suppliername = suppliername;
    }

    public String getSupplierpeople() {
        return supplierpeople;
    }

    public void setSupplierpeople(String supplierpeople) {
        this.supplierpeople = supplierpeople;
    }

    public Integer getSuppliermoney() {
        return suppliermoney;
    }

    public void setSuppliermoney(Integer suppliermoney) {
        this.suppliermoney = suppliermoney;
    }

    public String getSupplieraddress() {
        return supplieraddress;
    }

    public void setSupplieraddress(String supplieraddress) {
        this.supplieraddress = supplieraddress;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }

    public String getExplains() {
        return explains;
    }

    public void setExplains(String explains) {
        this.explains = explains;
    }
}