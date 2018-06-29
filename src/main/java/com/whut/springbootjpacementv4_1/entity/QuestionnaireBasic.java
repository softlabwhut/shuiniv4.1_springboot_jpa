package com.whut.springbootjpacementv4_1.entity;

import javax.persistence.*;

@Entity
@Table(name = "questionnaire_basic")
public class QuestionnaireBasic
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "quest_id")
    private Integer id;

    private String compName;

    private String designerName;

    private Integer dayCapacity;

    private String kinSize;








}
