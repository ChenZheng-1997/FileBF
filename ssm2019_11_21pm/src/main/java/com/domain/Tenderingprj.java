package com.domain;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

public class Tenderingprj {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Integer id;

    private Integer tenderingtypeid;

    private Integer userid;

    private String tenderingtitle;

    private String tenderingbody;

    private String fbtime;

    private Date jztime;

    private Date kbtime;

    private Integer supplierid;

    private Integer sign;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTenderingtypeid() {
        return tenderingtypeid;
    }

    public void setTenderingtypeid(Integer tenderingtypeid) {
        this.tenderingtypeid = tenderingtypeid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getTenderingtitle() {
        return tenderingtitle;
    }

    public void setTenderingtitle(String tenderingtitle) {
        this.tenderingtitle = tenderingtitle;
    }

    public String getTenderingbody() {
        return tenderingbody;
    }

    public void setTenderingbody(String tenderingbody) {
        this.tenderingbody = tenderingbody;
    }

    public String getFbtime() {
        return fbtime;
    }

    public void setFbtime(String fbtime) {
        this.fbtime = fbtime;
    }

    public Date getJztime() {
        return jztime;
    }

    public void setJztime(Date jztime) {
        this.jztime = jztime;
    }

    public Date getKbtime() {
        return kbtime;
    }

    public void setKbtime(Date kbtime) {
        this.kbtime = kbtime;
    }

    public Integer getSupplierid() {
        return supplierid;
    }

    public void setSupplierid(Integer supplierid) {
        this.supplierid = supplierid;
    }

    public Integer getSign() {
        return sign;
    }

    public void setSign(Integer sign) {
        this.sign = sign;
    }
}