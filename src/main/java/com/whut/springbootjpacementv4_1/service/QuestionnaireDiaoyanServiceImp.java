package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.QuestionnaireDiaoyan;
import com.whut.springbootjpacementv4_1.repository.QuestionnaireDiaoyanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @program: springbootjpacementv4_1
 * @description: 问卷调查Service实现类
 * @author: WuDi
 * @create: 2018-07-11 00:09
 **/
@Service
public class QuestionnaireDiaoyanServiceImp implements QuestionnaireDiaoyanService{

    @Autowired
    QuestionnaireDiaoyanRepository questionnaireDiaoyanRepository;

    @Override
    public Result addQuest(QuestionnaireDiaoyan questionnaireDiaoyan) {
        if(questionnaireDiaoyan!=null) {
            questionnaireDiaoyanRepository.save(questionnaireDiaoyan);
            return new Result(questionnaireDiaoyan);
        }
        else
             return new Result(401,"未知错误，创建失败！");
    }

    // 多条件查询
    public Page<QuestionnaireDiaoyan> query(QuestionnaireDiaoyan questionnaireDiaoyan, int page, int size){
        Example<QuestionnaireDiaoyan> ex=Example.of(questionnaireDiaoyan);
        return  questionnaireDiaoyanRepository.findAll(ex,new PageRequest(page, size));
    }

}
