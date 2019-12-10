package com.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Tenderingfile {

    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private Integer tenderingprjid;

    private String filepath;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenderingprjid() {
        return tenderingprjid;
    }

    public void setTenderingprjid(Integer tenderingprjid) {
        this.tenderingprjid = tenderingprjid;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
}