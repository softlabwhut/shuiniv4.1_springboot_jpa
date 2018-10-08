package com.whut.springbootjpacementv4_1.controller;

import com.alibaba.fastjson.JSONObject;
import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.QuestionaireTemplate;
import com.whut.springbootjpacementv4_1.entity.QuestionnaireDiaoyan;
import com.whut.springbootjpacementv4_1.service.QuestionnaireDiaoyanServiceImp;
import com.whut.springbootjpacementv4_1.service.QuestionnaireTempServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @Autowired
    QuestionnaireDiaoyanServiceImp questionnaireDiaoyanServiceImp;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public String getQuestionaireTempAll() {
        //todo

        return JSONObject.toJSONString(questionnaireTempServiceImp.getAll());


    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Result addQuest(@RequestBody QuestionaireTemplate questionaireTemplate) {
        return questionnaireTempServiceImp.add(questionaireTemplate);
    }

    @RequestMapping(value = "/diaoyan/add", method = RequestMethod.POST)
    public Result addQuestDiaoyan( @RequestBody QuestionnaireDiaoyan questionnaireDiaoyan) {
        return questionnaireDiaoyanServiceImp.addQuest(questionnaireDiaoyan);
    }

    /**
     * 调研问卷查询
     * @param questionnaireDiaoyan
     * @param page
     * @param size
     * @return
     */
    @RequestMapping(value = "/diaoyan/query")
    public Result queryQuestDiaoyan( QuestionnaireDiaoyan questionnaireDiaoyan,
                                    @RequestParam(name = "page", required = false, defaultValue = "0") int page,
                                    @RequestParam(name = "size", required = false, defaultValue = "10") int size) {

        return new Result(questionnaireDiaoyanServiceImp.query(questionnaireDiaoyan,page,size));
    }


}
