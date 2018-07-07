package com.whut.springbootjpacementv4_1.controller;


import com.whut.springbootjpacementv4_1.bean.FileUtil;
import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.SearchData;
import com.whut.springbootjpacementv4_1.service.SearchDataService;
import com.whut.springbootjpacementv4_1.vo.SearchDataQueryVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;

@RestController
public class SearchDataController {

    private static final Logger logger = LoggerFactory.getLogger(SearchDataController.class);

    @Autowired
    SearchDataService searchDataService;

    //查询数据
    @RequestMapping("/queryData")
    @ResponseBody
    public Result queryData(
            @RequestParam(name = "researchGroupNum", required = false, defaultValue = "0") int researchGroupNum,
            @RequestParam(name = "rcategory", required = false, defaultValue = "0") int rcategory,
            @RequestParam(name = "description", required = false, defaultValue = "") String description,
            @RequestParam(name = "keyWord", required = false, defaultValue = "") String keyWord,
            @RequestParam(name = "author", required = false, defaultValue = "") String author,
            //查询条件 是否精确查找  默认0 表示 模糊查询   1表示精确查询
            @RequestParam(name = "authorCon", required = false, defaultValue = "0") int authorCon,
            @RequestParam(name = "descriptionCon", required = false, defaultValue = "0")int descriptionCon,
            @RequestParam(name = "keyWordCon", required = false, defaultValue = "0")int keyWordCon ,
            //请求的 页数page 和 每页显示的数据个数 size
            @RequestParam(name = "page", required = false, defaultValue = "0")int page,
            @RequestParam(name = "size", required = false, defaultValue = "10")int size

    ) {
        Result result=new Result();

        SearchDataQueryVo searchDataQueryVo=new SearchDataQueryVo();
        SearchData searchData=new SearchData();
        searchData.setResearchGroupNum(researchGroupNum);
        searchData.setRcategory(rcategory);
        searchData.setDescription(description);
        searchData.setKeyWord(keyWord);
        searchData.setAuthor(author);
        searchDataQueryVo.setSearchData(searchData);
        searchDataQueryVo.setAuthor(authorCon);
        searchDataQueryVo.setKeyWord(keyWordCon);
        searchDataQueryVo.setDescription(descriptionCon);

        Page<SearchData> res= searchDataService.query(searchDataQueryVo,page,size);
        result.setStatus(1);
        result.setObject(res);

        return result;
    }


    //添加数据
    @RequestMapping(value = "/addData")
    @ResponseBody
    public Result addData(
            int researchGroupNum,
            int rcategory,
            String description,
            String keyWord,
            String author,
            @RequestParam(name = "permission", required = false, defaultValue = "1") int permissionCode,
            @RequestParam("file") MultipartFile file,
            HttpServletRequest request

    ) {
        Result result = new Result();
        String fileName = file.getOriginalFilename();
        String filePath = request.getSession().getServletContext().getRealPath("fileupload/");
        System.out.println(filePath);
        String downloadpath = "";
        try {
            downloadpath = FileUtil.uploadFile(file.getBytes(), filePath, fileName);
            logger.info(fileName + "文件上传成功");
        } catch (Exception e) {
            result.setMsg("文件上传失败");
            e.printStackTrace();
            return result;
        }
        SearchData searchData = searchDataService.addData(researchGroupNum, rcategory, description, keyWord, downloadpath, author, permissionCode);
        if (searchData != null) {
            result.setStatus(1);
            result.setObject(searchData);
            return result;
        }
        return result;
    }
}
