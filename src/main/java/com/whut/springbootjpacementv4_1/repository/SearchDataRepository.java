package com.whut.springbootjpacementv4_1.repository;


import com.whut.springbootjpacementv4_1.entity.SearchData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * # 数据表（research_data）
 * 1 主键ID(int)
 * 2 课题组 ID(int) 前端显示名称
 * 3 类别（--节能减排、热耗、String）
 * 4 描述（String）
 * 5 关键字(String)
 * 6 文件下载地址URL（String）
 * 7 作者（String）
 * 8 发布日期（Date）
 * 9 权限代码（Int）
 */
public interface SearchDataRepository extends JpaRepository<SearchData,Integer>  ,JpaSpecificationExecutor<SearchData> {

}
