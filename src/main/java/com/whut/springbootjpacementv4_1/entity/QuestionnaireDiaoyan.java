package com.whut.springbootjpacementv4_1.entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "questionnaire_diaoyan")
public class QuestionnaireDiaoyan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    public String getComp_name() {
        return comp_name;
    }

    public void setComp_name(String comp_name) {
        this.comp_name = comp_name;
    }

    @Column(name = "comp_name")
    private String comp_name;

    @Column(name = "author")
    private String author;

    @Column(name = "line_name")
    private String line_name;

    @Column(name = "line_size")
    private String line_size;

    @Column(name = "year_run_days ")
    private Integer year_run_days;

    @Column(name = "comp_address ")
    private String comp_address;

    @Column(name = " phone_num")
    private String phone_num;

    @Column(name = "zyxh_slsc_yl1_name ")
    private String zyxh_slsc_yl1_name;

    @Column(name = "zyxh_slsc_yl1_xiaohao")
    private Double zyxh_slsc_yl1_xiaohao;

    @Column(name = "zyxh_slsc_yl2_name")
    private String zyxh_slsc_yl2_name;

    @Column(name="zyxh_slsc_yl2_xiaohao")
    private Double zyxh_slsc_yl2_xiaohao;

    @Column(name = "zyxh_slsc_yl3_name")
    private String zyxh_slsc_yl3_name;

    @Column(name = "zyxh_slsc_yl3_xiaohao")
    private Double zyxh_slsc_yl3_xiaohao;

    @Column(name = "zyxh_slsc_yl4_name")
    private String zyxh_slsc_yl4_name;

    @Column(name = "zyxh_slsc_yl4_xiaohao")
    private Double zyxh_slsc_yl4_xiaohao;

    @Column(name = "zyxh_slsc_yl5_name")
    private String zyxh_slsc_yl5_name;

    @Column(name = "zyxh_slsc_yl5_xiaohao")
    private Double zyxh_slsc_yl5_xiaohao;

    @Column(name = "zyxh_slsc_yl6_name")
    private String zyxh_slsc_yl6_name;

    @Column(name = "zyxh_slsc_yl6_xiaohao")
    private Double zyxh_slsc_yl6_xiaohao;

    @Column(name = "zyxh_rl_rl1_name")
    private String zyxh_rl_rl1_name;

    @Column(name = "zyxh_rl_rl1_xiaohao")
    private Double zyxh_rl_rl1_xiaohao;

    @Column(name = "zyxh_rl_rl2_name")
    private String zyxh_rl_rl2_name;

    @Column(name = "zyxh_rl_rl2_xiaohao")
    private Double zyxh_rl_rl2_xiaohao;

    @Column(name = "zyxh_rl_rl3_name")
    private String zyxh_rl_rl3_name;

    @Column(name = "zyxh_rl_rl3_xiaohao")
    private Double zyxh_rl_rl3_xiaohao;

    @Column(name = "zyxh_shuliaocl")
    private Double zyxh_shuliaocl;

    @Column(name = "zyxh_slzcylc_yl1_name")
    private String zyxh_slzcylc_yl1_name;

    @Column(name = "zyxh_slzcylc_yl1_xiaohao")
    private Double zyxh_slzcylc_yl1_xiaohao;

    @Column(name = "zyxh_slzcylc_yl2_name")
    private String zyxh_slzcylc_yl2_name;

    @Column(name = "zyxh_slzcylc_yl2_xiaohao")
    private Double zyxh_slzcylc_yl2_xiaohao;

    @Column(name = "zyxh_slzcylc_yl3_name")
    private String zyxh_slzcylc_yl3_name;

    @Column(name = "zyxh_slzcylc_yl3_xiaohao")
    private Double zyxh_slzcylc_yl3_xiaohao;

    @Column(name = "zyxh_slzcylc_yl4_name")
    private String zyxh_slzcylc_yl4_name;

    @Column(name = "zyxh_slzcylc_yl4_xiaohao")
    private Double zyxh_slzcylc_yl4_xiaohao;

    @Column(name = "zyxh_slzcylc_yl5_name")
    private String zyxh_slzcylc_yl5_name;

    @Column(name = "zyxh_slzcylc_yl5_xiaohao")
    private Double zyxh_slzcylc_yl5_xiaohao;

    @Column(name = "zyxh_slzcylc_yl6_name")
    private String zyxh_slzcylc_yl6_name;

    @Column(name = "zyxh_slzcylc_yl6_xiaohao")
    private Double zyxh_slzcylc_yl6_xiaohao;

    @Column(name = "zyxh_slzcylc_yl7_name")
    private String zyxh_slzcylc_yl7_name;

    @Column(name = "zyxh_slzcylc_yl7_xiaohao")
    private Double zyxh_slzcylc_yl7_xiaohao;

    @Column(name = "zyxh_slzcylc_yl8_name")
    private String zyxh_slzcylc_yl8_name;

    @Column(name = "zyxh_slzcylc_yl8_xiaohao")
    private Double zyxh_slzcylc_yl8_xiaohao;

    @Column(name = "zyxh_slzcylc_yl9_name")
    private String zyxh_slzcylc_yl9_name;

    @Column(name = "zyxh_slzcylc_yl9_xiaohao")
    private Double zyxh_slzcylc_yl9_xiaohao;

    @Column(name = "zyxh_shuinicl")
    private Double zyxh_shuinicl;

    @Column(name = "nyxh_shengliao_dianhao")
    private Double nyxh_shengliao_dianhao;

    @Column(name = "nyxh_shuliao_meihao")
    private Double nyxh_shuliao_meihao;

    @Column(name = "nyxh_shuliao_dianhao")
    private Double nyxh_shuliao_dianhao;

    @Column(name = "nyxh_shuliao_nenghao")
    private Double nyxh_shuliao_nenghao;

    @Column(name = "nyxh_shuini_dianhao")
    private Double nyxh_shuini_dianhao;

    @Column(name = "nyxh_shuini_nenghao")
    private Double nyxh_shuini_nenghao;

    @Column(name = "nyxh_shuliao_fadian")
    private Double nyxh_shuliao_fadian;

    @Column(name = "fqpf_keliwu_yt_paifang")
    private Double fqpf_keliwu_yt_paifang;

    @Column(name = "fqpf_keliwu_yt_pfnongdu")
    private Double fqpf_keliwu_yt_pfnongdu;

    @Column(name = "fqpf_keliwu_yt_chuchen")
    private String fqpf_keliwu_yt_chuchen;

    @Column(name = "fqpf_keliwu_yw_paifang")
    private Double fqpf_keliwu_yw_paifang;

    @Column(name = "fqpf_keliwu_yw_pfnongdu")
    private Double fqpf_keliwu_yw_pfnongdu;

    @Column(name = "fqpf_keliwu_yw_chuchen")
    private String fqpf_keliwu_yw_chuchen;

    @Column(name = "fqpf_keliwu_snm_paifang")
    private Double fqpf_keliwu_snm_paifang;

    @Column(name = "fqpf_keliwu_snm_nongdu")
    private Double fqpf_keliwu_snm_nongdu;

    @Column(name = "fqpf_keliwu_snm_chuchen")
    private String fqpf_keliwu_snm_chuchen;

    @Column(name = "fqpf_keliwu_mm_paifang")
    private Double fqpf_keliwu_mm_paifang;

    @Column(name = "fqpf_keliwu_mm_nongdu")
    private Double fqpf_keliwu_mm_nongdu;

    @Column(name = "fqpf_keliwu_mm_chuchen")
    private String fqpf_keliwu_mm_chuchen;

    @Column(name = "fqpf_keliwu_bzj_paifang")
    private Double fqpf_keliwu_bzj_paifang;

    @Column(name = "fqpf_keliwu_bzj_nongdu")
    private Double fqpf_keliwu_bzj_nongdu;

    @Column(name = "fqpf_keliwu_bzj_chuchen")
    private String fqpf_keliwu_bzj_chuchen;

    @Column(name = "fqpf_SO2_yw_paifang")
    private Double fqpf_SO2_yw_paifang;

    @Column(name = "fqpf_SO2_yw_nongdu")
    private Double fqpf_SO2_yw_nongdu;

    @Column(name = "fqpf_SO2_yw_chuchen")
    private String fqpf_SO2_yw_chuchen;

    @Column(name = "fqpf_NOX_yw_paifang")
    private Double fqpf_NOX_yw_paifang;

    @Column(name = "fqpf_NOX_yw_nongdu")
    private Double fqpf_NOX_yw_nongdu;

    @Column(name = "fqpf_NOX_yw_chuchen")
    private String fqpf_NOX_yw_chuchen;

    @Column(name = "fqpf_pa_shuliao_paifang")
    private Double fqpf_pa_shuliao_paifang;

    @Column(name = "fqpf_pa_shuliao_nongdu")
    private Double fqpf_pa_shuliao_nongdu;

    @Column(name = "fqpf_pa_shuliao_chuchen")
    private String fqpf_pa_shuliao_chuchen;

    @Column(name = "fqpf_txgy_SNCR")
    private Byte fqpf_txgy_SNCR;

    @Column(name = "fqpf_txgy_fjrs")
    private Byte fqpf_txgy_fjrs;

    @Column(name = "fqpf_oneplustwo")
    private Byte fqpf_oneplustwo;

    @Column(name = "fqpf_txgy_qita")
    private Byte fqpf_txgy_qita;

    @Column(name = "zysb_shengliao_fenmo_qingkuang")
    private String zysb_shengliao_fenmo_qingkuang;

    @Column(name = "zysb_shengliao_xinghao")
    private String zysb_shengliao_xinghao;

    @Column(name = "zysb_shengliao_shuliang")
    private String zysb_shengliao_shuliang;

    @Column(name = "zysb_yao_guige")
    private String zysb_yao_guige;

    @Column(name = "zysb_shuinimo_fenmo")
    private String zysb_shuinimo_fenmo;

    @Column(name = "zysb_shuinimo_guige")
    private String zysb_shuinimo_guige;

    @Column(name = "zysb_shuinimo_shuliang")
    private String zysb_shuinimo_shuliang;

    @Column(name = "created_at")
    private Timestamp created_at;

    @Column(name = "updated_at")
    private Timestamp updated_at;

    @Column(name = "auditor")
    private String auditor;

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLine_name() {
        return line_name;
    }

    public void setLine_name(String line_name) {
        this.line_name = line_name;
    }

    public String getLine_size() {
        return line_size;
    }

    public void setLine_size(String line_size) {
        this.line_size = line_size;
    }

    public Integer getYear_run_days() {
        return year_run_days;
    }

    public void setYear_run_days(Integer year_run_days) {
        this.year_run_days = year_run_days;
    }

    public String getComp_address() {
        return comp_address;
    }

    public void setComp_address(String comp_address) {
        this.comp_address = comp_address;
    }

    public String getPhone_num() {
        return phone_num;
    }

    public void setPhone_num(String phone_num) {
        this.phone_num = phone_num;
    }

    public String getZyxh_slsc_yl1_name() {
        return zyxh_slsc_yl1_name;
    }

    public void setZyxh_slsc_yl1_name(String zyxh_slsc_yl1_name) {
        this.zyxh_slsc_yl1_name = zyxh_slsc_yl1_name;
    }

    public Double getZyxh_slsc_yl1_xiaohao() {
        return zyxh_slsc_yl1_xiaohao;
    }

    public void setZyxh_slsc_yl1_xiaohao(Double zyxh_slsc_yl1_xiaohao) {
        this.zyxh_slsc_yl1_xiaohao = zyxh_slsc_yl1_xiaohao;
    }

    public String getZyxh_slsc_yl2_name() {
        return zyxh_slsc_yl2_name;
    }

    public void setZyxh_slsc_yl2_name(String zyxh_slsc_yl2_name) {
        this.zyxh_slsc_yl2_name = zyxh_slsc_yl2_name;
    }

    public Double getZyxh_slsc_yl2_xiaohao() {
        return zyxh_slsc_yl2_xiaohao;
    }

    public void setZyxh_slsc_yl2_xiaohao(Double zyxh_slsc_yl2_xiaohao) {
        this.zyxh_slsc_yl2_xiaohao = zyxh_slsc_yl2_xiaohao;
    }

    public String getZyxh_slsc_yl3_name() {
        return zyxh_slsc_yl3_name;
    }

    public void setZyxh_slsc_yl3_name(String zyxh_slsc_yl3_name) {
        this.zyxh_slsc_yl3_name = zyxh_slsc_yl3_name;
    }

    public Double getZyxh_slsc_yl3_xiaohao() {
        return zyxh_slsc_yl3_xiaohao;
    }

    public void setZyxh_slsc_yl3_xiaohao(Double zyxh_slsc_yl3_xiaohao) {
        this.zyxh_slsc_yl3_xiaohao = zyxh_slsc_yl3_xiaohao;
    }

    public String getZyxh_slsc_yl4_name() {
        return zyxh_slsc_yl4_name;
    }

    public void setZyxh_slsc_yl4_name(String zyxh_slsc_yl4_name) {
        this.zyxh_slsc_yl4_name = zyxh_slsc_yl4_name;
    }

    public Double getZyxh_slsc_yl4_xiaohao() {
        return zyxh_slsc_yl4_xiaohao;
    }

    public void setZyxh_slsc_yl4_xiaohao(Double zyxh_slsc_yl4_xiaohao) {
        this.zyxh_slsc_yl4_xiaohao = zyxh_slsc_yl4_xiaohao;
    }

    public String getZyxh_slsc_yl5_name() {
        return zyxh_slsc_yl5_name;
    }

    public void setZyxh_slsc_yl5_name(String zyxh_slsc_yl5_name) {
        this.zyxh_slsc_yl5_name = zyxh_slsc_yl5_name;
    }

    public Double getZyxh_slsc_yl5_xiaohao() {
        return zyxh_slsc_yl5_xiaohao;
    }

    public void setZyxh_slsc_yl5_xiaohao(Double zyxh_slsc_yl5_xiaohao) {
        this.zyxh_slsc_yl5_xiaohao = zyxh_slsc_yl5_xiaohao;
    }

    public String getZyxh_slsc_yl6_name() {
        return zyxh_slsc_yl6_name;
    }

    public void setZyxh_slsc_yl6_name(String zyxh_slsc_yl6_name) {
        this.zyxh_slsc_yl6_name = zyxh_slsc_yl6_name;
    }

    public Double getZyxh_slsc_yl6_xiaohao() {
        return zyxh_slsc_yl6_xiaohao;
    }

    public void setZyxh_slsc_yl6_xiaohao(Double zyxh_slsc_yl6_xiaohao) {
        this.zyxh_slsc_yl6_xiaohao = zyxh_slsc_yl6_xiaohao;
    }

    public String getZyxh_rl_rl1_name() {
        return zyxh_rl_rl1_name;
    }

    public void setZyxh_rl_rl1_name(String zyxh_rl_rl1_name) {
        this.zyxh_rl_rl1_name = zyxh_rl_rl1_name;
    }

    public Double getZyxh_rl_rl1_xiaohao() {
        return zyxh_rl_rl1_xiaohao;
    }

    public void setZyxh_rl_rl1_xiaohao(Double zyxh_rl_rl1_xiaohao) {
        this.zyxh_rl_rl1_xiaohao = zyxh_rl_rl1_xiaohao;
    }

    public String getZyxh_rl_rl2_name() {
        return zyxh_rl_rl2_name;
    }

    public void setZyxh_rl_rl2_name(String zyxh_rl_rl2_name) {
        this.zyxh_rl_rl2_name = zyxh_rl_rl2_name;
    }

    public Double getZyxh_rl_rl2_xiaohao() {
        return zyxh_rl_rl2_xiaohao;
    }

    public void setZyxh_rl_rl2_xiaohao(Double zyxh_rl_rl2_xiaohao) {
        this.zyxh_rl_rl2_xiaohao = zyxh_rl_rl2_xiaohao;
    }

    public String getZyxh_rl_rl3_name() {
        return zyxh_rl_rl3_name;
    }

    public void setZyxh_rl_rl3_name(String zyxh_rl_rl3_name) {
        this.zyxh_rl_rl3_name = zyxh_rl_rl3_name;
    }

    public Double getZyxh_rl_rl3_xiaohao() {
        return zyxh_rl_rl3_xiaohao;
    }

    public void setZyxh_rl_rl3_xiaohao(Double zyxh_rl_rl3_xiaohao) {
        this.zyxh_rl_rl3_xiaohao = zyxh_rl_rl3_xiaohao;
    }

    public Double getZyxh_shuliaocl() {
        return zyxh_shuliaocl;
    }

    public void setZyxh_shuliaocl(Double zyxh_shuliaocl) {
        this.zyxh_shuliaocl = zyxh_shuliaocl;
    }

    public String getZyxh_slzcylc_yl1_name() {
        return zyxh_slzcylc_yl1_name;
    }

    public void setZyxh_slzcylc_yl1_name(String zyxh_slzcylc_yl1_name) {
        this.zyxh_slzcylc_yl1_name = zyxh_slzcylc_yl1_name;
    }

    public Double getZyxh_slzcylc_yl1_xiaohao() {
        return zyxh_slzcylc_yl1_xiaohao;
    }

    public void setZyxh_slzcylc_yl1_xiaohao(Double zyxh_slzcylc_yl1_xiaohao) {
        this.zyxh_slzcylc_yl1_xiaohao = zyxh_slzcylc_yl1_xiaohao;
    }

    public String getZyxh_slzcylc_yl2_name() {
        return zyxh_slzcylc_yl2_name;
    }

    public void setZyxh_slzcylc_yl2_name(String zyxh_slzcylc_yl2_name) {
        this.zyxh_slzcylc_yl2_name = zyxh_slzcylc_yl2_name;
    }

    public Double getZyxh_slzcylc_yl2_xiaohao() {
        return zyxh_slzcylc_yl2_xiaohao;
    }

    public void setZyxh_slzcylc_yl2_xiaohao(Double zyxh_slzcylc_yl2_xiaohao) {
        this.zyxh_slzcylc_yl2_xiaohao = zyxh_slzcylc_yl2_xiaohao;
    }

    public String getZyxh_slzcylc_yl3_name() {
        return zyxh_slzcylc_yl3_name;
    }

    public void setZyxh_slzcylc_yl3_name(String zyxh_slzcylc_yl3_name) {
        this.zyxh_slzcylc_yl3_name = zyxh_slzcylc_yl3_name;
    }

    public Double getZyxh_slzcylc_yl3_xiaohao() {
        return zyxh_slzcylc_yl3_xiaohao;
    }

    public void setZyxh_slzcylc_yl3_xiaohao(Double zyxh_slzcylc_yl3_xiaohao) {
        this.zyxh_slzcylc_yl3_xiaohao = zyxh_slzcylc_yl3_xiaohao;
    }

    public String getZyxh_slzcylc_yl4_name() {
        return zyxh_slzcylc_yl4_name;
    }

    public void setZyxh_slzcylc_yl4_name(String zyxh_slzcylc_yl4_name) {
        this.zyxh_slzcylc_yl4_name = zyxh_slzcylc_yl4_name;
    }

    public Double getZyxh_slzcylc_yl4_xiaohao() {
        return zyxh_slzcylc_yl4_xiaohao;
    }

    public void setZyxh_slzcylc_yl4_xiaohao(Double zyxh_slzcylc_yl4_xiaohao) {
        this.zyxh_slzcylc_yl4_xiaohao = zyxh_slzcylc_yl4_xiaohao;
    }

    public String getZyxh_slzcylc_yl5_name() {
        return zyxh_slzcylc_yl5_name;
    }

    public void setZyxh_slzcylc_yl5_name(String zyxh_slzcylc_yl5_name) {
        this.zyxh_slzcylc_yl5_name = zyxh_slzcylc_yl5_name;
    }

    public Double getZyxh_slzcylc_yl5_xiaohao() {
        return zyxh_slzcylc_yl5_xiaohao;
    }

    public void setZyxh_slzcylc_yl5_xiaohao(Double zyxh_slzcylc_yl5_xiaohao) {
        this.zyxh_slzcylc_yl5_xiaohao = zyxh_slzcylc_yl5_xiaohao;
    }

    public String getZyxh_slzcylc_yl6_name() {
        return zyxh_slzcylc_yl6_name;
    }

    public void setZyxh_slzcylc_yl6_name(String zyxh_slzcylc_yl6_name) {
        this.zyxh_slzcylc_yl6_name = zyxh_slzcylc_yl6_name;
    }

    public Double getZyxh_slzcylc_yl6_xiaohao() {
        return zyxh_slzcylc_yl6_xiaohao;
    }

    public void setZyxh_slzcylc_yl6_xiaohao(Double zyxh_slzcylc_yl6_xiaohao) {
        this.zyxh_slzcylc_yl6_xiaohao = zyxh_slzcylc_yl6_xiaohao;
    }

    public String getZyxh_slzcylc_yl7_name() {
        return zyxh_slzcylc_yl7_name;
    }

    public void setZyxh_slzcylc_yl7_name(String zyxh_slzcylc_yl7_name) {
        this.zyxh_slzcylc_yl7_name = zyxh_slzcylc_yl7_name;
    }

    public Double getZyxh_slzcylc_yl7_xiaohao() {
        return zyxh_slzcylc_yl7_xiaohao;
    }

    public void setZyxh_slzcylc_yl7_xiaohao(Double zyxh_slzcylc_yl7_xiaohao) {
        this.zyxh_slzcylc_yl7_xiaohao = zyxh_slzcylc_yl7_xiaohao;
    }

    public String getZyxh_slzcylc_yl8_name() {
        return zyxh_slzcylc_yl8_name;
    }

    public void setZyxh_slzcylc_yl8_name(String zyxh_slzcylc_yl8_name) {
        this.zyxh_slzcylc_yl8_name = zyxh_slzcylc_yl8_name;
    }

    public Double getZyxh_slzcylc_yl8_xiaohao() {
        return zyxh_slzcylc_yl8_xiaohao;
    }

    public void setZyxh_slzcylc_yl8_xiaohao(Double zyxh_slzcylc_yl8_xiaohao) {
        this.zyxh_slzcylc_yl8_xiaohao = zyxh_slzcylc_yl8_xiaohao;
    }

    public String getZyxh_slzcylc_yl9_name() {
        return zyxh_slzcylc_yl9_name;
    }

    public void setZyxh_slzcylc_yl9_name(String zyxh_slzcylc_yl9_name) {
        this.zyxh_slzcylc_yl9_name = zyxh_slzcylc_yl9_name;
    }

    public Double getZyxh_slzcylc_yl9_xiaohao() {
        return zyxh_slzcylc_yl9_xiaohao;
    }

    public void setZyxh_slzcylc_yl9_xiaohao(Double zyxh_slzcylc_yl9_xiaohao) {
        this.zyxh_slzcylc_yl9_xiaohao = zyxh_slzcylc_yl9_xiaohao;
    }

    public Double getZyxh_shuinicl() {
        return zyxh_shuinicl;
    }

    public void setZyxh_shuinicl(Double zyxh_shuinicl) {
        this.zyxh_shuinicl = zyxh_shuinicl;
    }

    public Double getNyxh_shengliao_dianhao() {
        return nyxh_shengliao_dianhao;
    }

    public void setNyxh_shengliao_dianhao(Double nyxh_shengliao_dianhao) {
        this.nyxh_shengliao_dianhao = nyxh_shengliao_dianhao;
    }

    public Double getNyxh_shuliao_meihao() {
        return nyxh_shuliao_meihao;
    }

    public void setNyxh_shuliao_meihao(Double nyxh_shuliao_meihao) {
        this.nyxh_shuliao_meihao = nyxh_shuliao_meihao;
    }

    public Double getNyxh_shuliao_dianhao() {
        return nyxh_shuliao_dianhao;
    }

    public void setNyxh_shuliao_dianhao(Double nyxh_shuliao_dianhao) {
        this.nyxh_shuliao_dianhao = nyxh_shuliao_dianhao;
    }

    public Double getNyxh_shuliao_nenghao() {
        return nyxh_shuliao_nenghao;
    }

    public void setNyxh_shuliao_nenghao(Double nyxh_shuliao_nenghao) {
        this.nyxh_shuliao_nenghao = nyxh_shuliao_nenghao;
    }

    public Double getNyxh_shuini_dianhao() {
        return nyxh_shuini_dianhao;
    }

    public void setNyxh_shuini_dianhao(Double nyxh_shuini_dianhao) {
        this.nyxh_shuini_dianhao = nyxh_shuini_dianhao;
    }

    public Double getNyxh_shuini_nenghao() {
        return nyxh_shuini_nenghao;
    }

    public void setNyxh_shuini_nenghao(Double nyxh_shuini_nenghao) {
        this.nyxh_shuini_nenghao = nyxh_shuini_nenghao;
    }

    public Double getNyxh_shuliao_fadian() {
        return nyxh_shuliao_fadian;
    }

    public void setNyxh_shuliao_fadian(Double nyxh_shuliao_fadian) {
        this.nyxh_shuliao_fadian = nyxh_shuliao_fadian;
    }

    public Double getFqpf_keliwu_yt_paifang() {
        return fqpf_keliwu_yt_paifang;
    }

    public void setFqpf_keliwu_yt_paifang(Double fqpf_keliwu_yt_paifang) {
        this.fqpf_keliwu_yt_paifang = fqpf_keliwu_yt_paifang;
    }

    public Double getFqpf_keliwu_yt_pfnongdu() {
        return fqpf_keliwu_yt_pfnongdu;
    }

    public void setFqpf_keliwu_yt_pfnongdu(Double fqpf_keliwu_yt_pfnongdu) {
        this.fqpf_keliwu_yt_pfnongdu = fqpf_keliwu_yt_pfnongdu;
    }

    public String getFqpf_keliwu_yt_chuchen() {
        return fqpf_keliwu_yt_chuchen;
    }

    public void setFqpf_keliwu_yt_chuchen(String fqpf_keliwu_yt_chuchen) {
        this.fqpf_keliwu_yt_chuchen = fqpf_keliwu_yt_chuchen;
    }

    public Double getFqpf_keliwu_yw_paifang() {
        return fqpf_keliwu_yw_paifang;
    }

    public void setFqpf_keliwu_yw_paifang(Double fqpf_keliwu_yw_paifang) {
        this.fqpf_keliwu_yw_paifang = fqpf_keliwu_yw_paifang;
    }

    public Double getFqpf_keliwu_yw_pfnongdu() {
        return fqpf_keliwu_yw_pfnongdu;
    }

    public void setFqpf_keliwu_yw_pfnongdu(Double fqpf_keliwu_yw_pfnongdu) {
        this.fqpf_keliwu_yw_pfnongdu = fqpf_keliwu_yw_pfnongdu;
    }

    public String getFqpf_keliwu_yw_chuchen() {
        return fqpf_keliwu_yw_chuchen;
    }

    public void setFqpf_keliwu_yw_chuchen(String fqpf_keliwu_yw_chuchen) {
        this.fqpf_keliwu_yw_chuchen = fqpf_keliwu_yw_chuchen;
    }

    public Double getFqpf_keliwu_snm_paifang() {
        return fqpf_keliwu_snm_paifang;
    }

    public void setFqpf_keliwu_snm_paifang(Double fqpf_keliwu_snm_paifang) {
        this.fqpf_keliwu_snm_paifang = fqpf_keliwu_snm_paifang;
    }

    public Double getFqpf_keliwu_snm_nongdu() {
        return fqpf_keliwu_snm_nongdu;
    }

    public void setFqpf_keliwu_snm_nongdu(Double fqpf_keliwu_snm_nongdu) {
        this.fqpf_keliwu_snm_nongdu = fqpf_keliwu_snm_nongdu;
    }

    public String getFqpf_keliwu_snm_chuchen() {
        return fqpf_keliwu_snm_chuchen;
    }

    public void setFqpf_keliwu_snm_chuchen(String fqpf_keliwu_snm_chuchen) {
        this.fqpf_keliwu_snm_chuchen = fqpf_keliwu_snm_chuchen;
    }

    public Double getFqpf_keliwu_mm_paifang() {
        return fqpf_keliwu_mm_paifang;
    }

    public void setFqpf_keliwu_mm_paifang(Double fqpf_keliwu_mm_paifang) {
        this.fqpf_keliwu_mm_paifang = fqpf_keliwu_mm_paifang;
    }

    public Double getFqpf_keliwu_mm_nongdu() {
        return fqpf_keliwu_mm_nongdu;
    }

    public void setFqpf_keliwu_mm_nongdu(Double fqpf_keliwu_mm_nongdu) {
        this.fqpf_keliwu_mm_nongdu = fqpf_keliwu_mm_nongdu;
    }

    public String getFqpf_keliwu_mm_chuchen() {
        return fqpf_keliwu_mm_chuchen;
    }

    public void setFqpf_keliwu_mm_chuchen(String fqpf_keliwu_mm_chuchen) {
        this.fqpf_keliwu_mm_chuchen = fqpf_keliwu_mm_chuchen;
    }

    public Double getFqpf_keliwu_bzj_paifang() {
        return fqpf_keliwu_bzj_paifang;
    }

    public void setFqpf_keliwu_bzj_paifang(Double fqpf_keliwu_bzj_paifang) {
        this.fqpf_keliwu_bzj_paifang = fqpf_keliwu_bzj_paifang;
    }

    public Double getFqpf_keliwu_bzj_nongdu() {
        return fqpf_keliwu_bzj_nongdu;
    }

    public void setFqpf_keliwu_bzj_nongdu(Double fqpf_keliwu_bzj_nongdu) {
        this.fqpf_keliwu_bzj_nongdu = fqpf_keliwu_bzj_nongdu;
    }

    public String getFqpf_keliwu_bzj_chuchen() {
        return fqpf_keliwu_bzj_chuchen;
    }

    public void setFqpf_keliwu_bzj_chuchen(String fqpf_keliwu_bzj_chuchen) {
        this.fqpf_keliwu_bzj_chuchen = fqpf_keliwu_bzj_chuchen;
    }

    public Double getFqpf_SO2_yw_paifang() {
        return fqpf_SO2_yw_paifang;
    }

    public void setFqpf_SO2_yw_paifang(Double fqpf_SO2_yw_paifang) {
        this.fqpf_SO2_yw_paifang = fqpf_SO2_yw_paifang;
    }

    public Double getFqpf_SO2_yw_nongdu() {
        return fqpf_SO2_yw_nongdu;
    }

    public void setFqpf_SO2_yw_nongdu(Double fqpf_SO2_yw_nongdu) {
        this.fqpf_SO2_yw_nongdu = fqpf_SO2_yw_nongdu;
    }

    public String getFqpf_SO2_yw_chuchen() {
        return fqpf_SO2_yw_chuchen;
    }

    public void setFqpf_SO2_yw_chuchen(String fqpf_SO2_yw_chuchen) {
        this.fqpf_SO2_yw_chuchen = fqpf_SO2_yw_chuchen;
    }

    public Double getFqpf_NOX_yw_paifang() {
        return fqpf_NOX_yw_paifang;
    }

    public void setFqpf_NOX_yw_paifang(Double fqpf_NOX_yw_paifang) {
        this.fqpf_NOX_yw_paifang = fqpf_NOX_yw_paifang;
    }

    public Double getFqpf_NOX_yw_nongdu() {
        return fqpf_NOX_yw_nongdu;
    }

    public void setFqpf_NOX_yw_nongdu(Double fqpf_NOX_yw_nongdu) {
        this.fqpf_NOX_yw_nongdu = fqpf_NOX_yw_nongdu;
    }

    public String getFqpf_NOX_yw_chuchen() {
        return fqpf_NOX_yw_chuchen;
    }

    public void setFqpf_NOX_yw_chuchen(String fqpf_NOX_yw_chuchen) {
        this.fqpf_NOX_yw_chuchen = fqpf_NOX_yw_chuchen;
    }

    public Double getFqpf_pa_shuliao_paifang() {
        return fqpf_pa_shuliao_paifang;
    }

    public void setFqpf_pa_shuliao_paifang(Double fqpf_pa_shuliao_paifang) {
        this.fqpf_pa_shuliao_paifang = fqpf_pa_shuliao_paifang;
    }

    public Double getFqpf_pa_shuliao_nongdu() {
        return fqpf_pa_shuliao_nongdu;
    }

    public void setFqpf_pa_shuliao_nongdu(Double fqpf_pa_shuliao_nongdu) {
        this.fqpf_pa_shuliao_nongdu = fqpf_pa_shuliao_nongdu;
    }

    public String getFqpf_pa_shuliao_chuchen() {
        return fqpf_pa_shuliao_chuchen;
    }

    public void setFqpf_pa_shuliao_chuchen(String fqpf_pa_shuliao_chuchen) {
        this.fqpf_pa_shuliao_chuchen = fqpf_pa_shuliao_chuchen;
    }

    public Byte getFqpf_txgy_SNCR() {
        return fqpf_txgy_SNCR;
    }

    public void setFqpf_txgy_SNCR(Byte fqpf_txgy_SNCR) {
        this.fqpf_txgy_SNCR = fqpf_txgy_SNCR;
    }

    public Byte getFqpf_txgy_fjrs() {
        return fqpf_txgy_fjrs;
    }

    public void setFqpf_txgy_fjrs(Byte fqpf_txgy_fjrs) {
        this.fqpf_txgy_fjrs = fqpf_txgy_fjrs;
    }

    public Byte getFqpf_oneplustwo() {
        return fqpf_oneplustwo;
    }

    public void setFqpf_oneplustwo(Byte fqpf_oneplustwo) {
        this.fqpf_oneplustwo = fqpf_oneplustwo;
    }

    public Byte getFqpf_txgy_qita() {
        return fqpf_txgy_qita;
    }

    public void setFqpf_txgy_qita(Byte fqpf_txgy_qita) {
        this.fqpf_txgy_qita = fqpf_txgy_qita;
    }

    public String getZysb_shengliao_fenmo_qingkuang() {
        return zysb_shengliao_fenmo_qingkuang;
    }

    public void setZysb_shengliao_fenmo_qingkuang(String zysb_shengliao_fenmo_qingkuang) {
        this.zysb_shengliao_fenmo_qingkuang = zysb_shengliao_fenmo_qingkuang;
    }

    public String getZysb_shengliao_xinghao() {
        return zysb_shengliao_xinghao;
    }

    public void setZysb_shengliao_xinghao(String zysb_shengliao_xinghao) {
        this.zysb_shengliao_xinghao = zysb_shengliao_xinghao;
    }

    public String getZysb_shengliao_shuliang() {
        return zysb_shengliao_shuliang;
    }

    public void setZysb_shengliao_shuliang(String zysb_shengliao_shuliang) {
        this.zysb_shengliao_shuliang = zysb_shengliao_shuliang;
    }

    public String getZysb_yao_guige() {
        return zysb_yao_guige;
    }

    public void setZysb_yao_guige(String zysb_yao_guige) {
        this.zysb_yao_guige = zysb_yao_guige;
    }

    public String getZysb_shuinimo_fenmo() {
        return zysb_shuinimo_fenmo;
    }

    public void setZysb_shuinimo_fenmo(String zysb_shuinimo_fenmo) {
        this.zysb_shuinimo_fenmo = zysb_shuinimo_fenmo;
    }

    public String getZysb_shuinimo_guige() {
        return zysb_shuinimo_guige;
    }

    public void setZysb_shuinimo_guige(String zysb_shuinimo_guige) {
        this.zysb_shuinimo_guige = zysb_shuinimo_guige;
    }

    public String getZysb_shuinimo_shuliang() {
        return zysb_shuinimo_shuliang;
    }

    public void setZysb_shuinimo_shuliang(String zysb_shuinimo_shuliang) {
        this.zysb_shuinimo_shuliang = zysb_shuinimo_shuliang;
    }
}