package com.whut.springbootjpacementv4_1.vo;

import com.whut.springbootjpacementv4_1.entity.SearchData;

/**
 * 后台查询
 */

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
public class SearchDataQueryVo {

    private SearchData searchData;

    //相关字段是否精确 或者模糊查询
    //默认是模糊查询 用int 不用bool
    int author;

    int description;

    int keyWord;

    public SearchData getSearchData() {
        return searchData;
    }

    public void setSearchData(SearchData searchData) {
        this.searchData = searchData;
    }

    public int getDescription() {
        return description;
    }

    public void setDescription(int description) {
        this.description = description;
    }

    public int getKeyWord() {
        return keyWord;
    }

    public void setKeyWord(int keyWord) {
        this.keyWord = keyWord;
    }

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public int getPermissionCode() {
        return permissionCode;
    }

    public void setPermissionCode(int permissionCode) {
        this.permissionCode = permissionCode;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }


    //  定义大于 小于 等于等含义
    int permissionCode;

    int publishDate;


}
