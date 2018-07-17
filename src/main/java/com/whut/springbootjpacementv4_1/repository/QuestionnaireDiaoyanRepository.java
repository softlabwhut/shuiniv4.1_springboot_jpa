package com.whut.springbootjpacementv4_1.repository;

import com.whut.springbootjpacementv4_1.entity.QuestionnaireDiaoyan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

public interface QuestionnaireDiaoyanRepository extends JpaRepository<QuestionnaireDiaoyan,Integer>,QueryByExampleExecutor<QuestionnaireDiaoyan> {
}
