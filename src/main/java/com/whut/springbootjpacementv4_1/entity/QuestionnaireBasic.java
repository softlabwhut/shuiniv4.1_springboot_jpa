package com.whut.springbootjpacementv4_1.entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "questionnaire_basic")
public class QuestionnaireBasic
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quest_id")
    private Integer id;

    @Column(name = "comp_name")
    private String compName;

    @Column(name = "designer_name")
    private String designerName;

    @Column(name = "day_capacity")
    private Integer dayCapacity;

    @Column(name = "kin_size")
    private String kinSize;

    @Column(name = "pre_heater")
    private String preHeater;

    @Column(name = "dslgx_power")
    private Integer dslgxPower;

    @Column(name = "burning_heat")
    private Integer burningHeat;

    @Column(name = "operate_rate")
    private Double operateRate;

    @Column(name = "waste_gen_electr")
    private Double wasteGenElectr;

    @Column(name = "region_id")
    private Byte regionId;

    @Column(name = "submit_date")
    private Date submitDate;

    @Column(name = "submiter")
    private String submiter;

    @Column(name = "line_number")
    private Integer lineNumber;






















}
