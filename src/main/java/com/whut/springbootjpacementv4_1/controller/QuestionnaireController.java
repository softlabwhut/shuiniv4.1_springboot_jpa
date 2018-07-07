package com.whut.springbootjpacementv4_1.controller;

import com.whut.springbootjpacementv4_1.service.QuestionnaireTempServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * @program: springbootjpacementv4_1
 * @description: 调查问卷表的接口
 * @author: WuDi
 * @create: 2018-06-29 23:52
 **/

@RestController
@RequestMapping(value = "/questionnaires")
public class QuestionnaireController {

    @Autowired
    QuestionnaireTempServiceImp questionnaireTempServiceImp;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public String getQuestionaireTempAll(){
       //todo
     //   return JSONObject.toJSONString(questionnaireTempServiceImp.getAll());

        return null;
    }


}
