package com.rabbit.adpromotion.web.dao.model;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

public class DemoTable implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;
    private String demoName;
    private Integer demoAge;
    @JsonFormat(pattern ="yyyy-MM-dd HH:mm:ss")
    private Date demoTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDemoName() {
        return demoName;
    }

    public void setDemoName(String demoName) {
        this.demoName = demoName;
    }

    public Integer getDemoAge() {
        return demoAge;
    }

    public void setDemoAge(Integer demoAge) {
        this.demoAge = demoAge;
    }

    public Date getDemoTime() {
        return demoTime;
    }

    public void setDemoTime(Date demoTime) {
        this.demoTime = demoTime;
    }
}
