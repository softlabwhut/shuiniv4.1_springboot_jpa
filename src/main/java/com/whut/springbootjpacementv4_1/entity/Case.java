package com.whut.springbootjpacementv4_1.entity;


import javax.persistence.*;

@Entity
@Table(name = "c_case")  //关键字冲突 case
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    //典型案例名
    @Column(name = "cname")
    private String cname;
    //案例所属的分类
    @Column(name = "ccategory")
    private Integer ccategory;

    //典型案例 文件下载地址
    @Column(name = "cfileSrc")
    private String cfileSrc;

    public Case() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCcategory() {
        return ccategory;
    }

    public void setCcategory(Integer ccategory) {
        this.ccategory = ccategory;
    }

    public String getCfileSrc() {
        return cfileSrc;
    }

    public void setCfileSrc(String cfileSrc) {
        this.cfileSrc = cfileSrc;
    }
}
