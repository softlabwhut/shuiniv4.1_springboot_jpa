package com.whut.springbootjpacementv4_1.service;

import com.whut.springbootjpacementv4_1.entity.QuestionaireTemplate;
import com.whut.springbootjpacementv4_1.repository.QuestionaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class QuestionaireTempServiceImp implements QuestionaireTempService {

    @Autowired
    QuestionaireRepository questionaireRepository;

    public List<QuestionaireTemplate> getAll() {

        System.out.println(questionaireRepository.findAll());
        List<QuestionaireTemplate> questionaireTemplateList = questionaireRepository.findAll();

        return questionaireTemplateList;
    }
}
