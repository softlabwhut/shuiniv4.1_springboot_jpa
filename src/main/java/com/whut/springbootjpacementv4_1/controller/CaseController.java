package com.whut.springbootjpacementv4_1.controller;


import com.whut.springbootjpacementv4_1.bean.FileUtil;
import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.Case;
import com.whut.springbootjpacementv4_1.service.CaseService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;

/**
 * @author chende
 * 典型案例
 */

// 案例的增删改查
@RestController
public class CaseController {

    @Autowired
    CaseService caseService;

   // private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    //典型案例上传
    @RequestMapping(value = "/addCase")
    @ResponseBody
    public Result addCase(String c_name,
                          Integer c_category,
                          @RequestParam("file") MultipartFile file,
                          HttpServletRequest request

    ) {
        Result result = new Result();
        //上传文件
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        /*System.out.println("fileName-->" + fileName);
        System.out.println("getContentType-->" + contentType);*/
        String filePath = request.getSession().getServletContext().getRealPath("fileupload/");
        System.out.println(filePath);
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            // TODO: handle exception
           result.setMsg("文件上传失败");
            e.printStackTrace();
            return result;

        }

        Case re = caseService.addCase(c_name, c_category, filePath+ File.separator+fileName);
        result.setStatus(1);
        result.setObject(re);


        return result;
    }

    //案例查询
    @RequestMapping(value = "/queryCase")
    @ResponseBody
    public Result queryCase(


    ) {
        Result result = new Result();


        return result;
    }

}
