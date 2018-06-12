package com.whut.springbootjpacementv4_1.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "tb_com")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "region_id")
    private Integer region_id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name= "postcode")
    private String postcode;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "status")
    private String status;

    @Column(name = "phone_number")
    private String phone_number;

    @Column(name = "year_capacity")
    private Integer year_capacity;

    @Column(name = "remark")
    private String remark;

    @Column(name = "invited_person")
    private String invited_person;

    @Column(name = "wj_title")
    private String wj_title;

    @Column(name = "start_date")
    private Date start_date;

    @Column(name = "end_date")
    private Date end_date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRegionId() {
        return region_id;
    }

    public void setRegionId(Integer region_id) {
        this.region_id = region_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPhoneNumber() {
        return phone_number;
    }

    public void setPhoneNumber(String phone_number) {
        this.phone_number = phone_number;
    }

    public Integer getYearCapacity() {
        return year_capacity;
    }

    public void setYearCapacity(Integer year_capacity) {
        this.year_capacity = year_capacity;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getInvitedPerson() {
        return invited_person;
    }

    public void setInvitedPerson(String invited_person) {
        this.invited_person = invited_person;
    }

    public String getWjTitle() {
        return wj_title;
    }

    public void setWjTitle(String wj_title) {
        this.wj_title = wj_title;
    }

    public Date getStartDate() {
        return start_date;
    }

    public void setStartDate(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEndDate() {
        return end_date;
    }

    public void setEndDate(Date end_date) {
        this.end_date = end_date;
    }









}
