package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.entity.QuestionaireTemplate;
import com.whut.springbootjpacementv4_1.repository.QuestionnaireRepository;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

@Service
public class QuestionnaireTempServiceImp implements QuestionnaireTempService {

    @Resource
    QuestionnaireRepository questionnaireRepository;

    public List<QuestionaireTemplate> getAll() {

        System.out.println(questionnaireRepository.findAll());

        return questionnaireRepository.findAll();
    }
}
