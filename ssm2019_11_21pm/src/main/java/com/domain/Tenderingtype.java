package com.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Tenderingtype {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private String tenderingtypename;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTenderingtypename() {
        return tenderingtypename;
    }

    public void setTenderingtypename(String tenderingtypename) {
        this.tenderingtypename = tenderingtypename;
    }
}