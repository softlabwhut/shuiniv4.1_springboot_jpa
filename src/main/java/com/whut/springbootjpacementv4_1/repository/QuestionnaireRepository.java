package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.QuestionaireTemplate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "questionaireRepository")
public interface QuestionnaireRepository extends JpaRepository<QuestionaireTemplate,Integer> {

}
