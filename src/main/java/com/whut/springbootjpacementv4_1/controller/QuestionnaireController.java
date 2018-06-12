package com.whut.springbootjpacementv4_1.controller;

import com.whut.springbootjpacementv4_1.service.QuestionnaireTempServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSONObject;


@RestController
@RequestMapping(value = "/questionnaires")
public class QuestionnaireController {

    @Autowired
    QuestionnaireTempServiceImp questionnaireTempServiceImp;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public String getQuestionaireTempAll(){

        return JSONObject.toJSONString(questionnaireTempServiceImp.getAll());

    }


}
