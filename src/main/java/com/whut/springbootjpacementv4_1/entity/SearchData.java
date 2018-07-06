package com.whut.springbootjpacementv4_1.entity;


import javax.persistence.*;
import java.util.Date;

/**
 * # 数据表（research_data）
 * 1 主键ID(int)
 * 2 课题组 ID(int) 前端显示名称
 * 3 类别（--节能减排、热耗、String）
 * 4 描述（String）
 * 5 关键字(String)
 * 6 文件下载地址URL（String）
 * 7 作者（String）
 * 8 发布日期（Date）
 * 9 权限代码（Int）
 */

@Entity
@Table(name = "search_data")
public class SearchData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "researchGroupNum")
    private int researchGroupNum;

    @Column(name = "rcategory")
    private int rcategory;

    @Column(name = "description")
    private String description;

    @Column(name = "keyWord")
    private String keyWord;

    @Column(name = "fileSrc")
    private String fileSrc;

    @Column(name = "author")
    private String author;

    @Column(name = "publishDate")
    private Date publishDate;

    @Column(name = "permissionCode")
    private int permissionCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getResearchGroupNum() {
        return researchGroupNum;
    }

    public void setResearchGroupNum(int researchGroupNum) {
        this.researchGroupNum = researchGroupNum;
    }

    public int getRcategory() {
        return rcategory;
    }

    public void setRcategory(int rcategory) {
        this.rcategory = rcategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(String keyWord) {
        this.keyWord = keyWord;
    }

    public String getFileSrc() {
        return fileSrc;
    }

    public void setFileSrc(String fileSrc) {
        this.fileSrc = fileSrc;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    public int getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(int permissionCode) {
        this.permissionCode = permissionCode;
    }
}
