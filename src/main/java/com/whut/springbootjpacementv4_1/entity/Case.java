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
    @Column(name = "c_name")
    private String c_name;
    //案例所属的分类
    @Column(name = "c_category")
    private Integer c_category;

    //典型案例 文件下载地址
    @Column(name = "c_fileSrc")
    private String c_fileSrc;

    public Case() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getC_name() {
        return c_name;
    }

    public void setC_name(String c_name) {
        this.c_name = c_name;
    }

    public Integer getC_category() {
        return c_category;
    }

    public void setC_category(Integer c_category) {
        this.c_category = c_category;
    }

    public String getC_fileSrc() {
        return c_fileSrc;
    }

    public void setC_fileSrc(String c_fileSrc) {
        this.c_fileSrc = c_fileSrc;
    }
}
