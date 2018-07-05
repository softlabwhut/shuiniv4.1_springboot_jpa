package com.whut.springbootjpacementv4_1.controller;


import com.whut.springbootjpacementv4_1.bean.FileUtil;
import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.service.FileService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;

/**
 * @program: springbootjpacementv4_1
 * @description: 文件上传下载接口
 * @author: 陈德大佬，WuDi
 * @create: 2018-06-29 23:52
 **/
@RestController
public class FileController {

    @Autowired
    FileService fileService;

    private static final Logger logger = LoggerFactory.getLogger(FileController.class);

    @Value("${file.store}")
    String path;

    //文件下载   String downLoadPath="/file?fileName="+fileName;
     @RequestMapping(value = "/file")
     @ResponseBody
     public void downloadFile(String fileName, HttpServletResponse response,HttpServletRequest request){
         Result result=new Result();
         String filePath = request.getSession().getServletContext().getRealPath(path);
         File f=new File(filePath,fileName);
         if( !f.exists() || !f.isFile() )
         {
             System.out.println("下载文件不存在");
             logger.info("log: 文件不存在");
             result.setMsg("下载文件不存在");

         }
         logger.info("下载文件"+fileName);
        if (fileService.downloadFile(f,response,request))
        {
            result.setStatus(1);
        }
        else
            result.setMsg(" 下载文件失败");




     }



    //处理文件上传
    @RequestMapping(value="/testuploadimg", method = RequestMethod.POST)

    public  String uploadImg(@RequestParam("file") MultipartFile file,
                                          HttpServletRequest request) {
        String contentType = file.getContentType();
        String fileName = file.getOriginalFilename();
        /*System.out.println("fileName-->" + fileName);
        System.out.println("getContentType-->" + contentType);*/
        String filePath = request.getSession().getServletContext().getRealPath(path);
        try {
            FileUtil.uploadFile(file.getBytes(), filePath, fileName);
        } catch (Exception e) {
            // TODO: handle exception
        }
        //返回json
        return "uploadimg success";
    }

    /**
     * 实现文件上传
     * */
    @RequestMapping("fileUpload")
    @ResponseBody
    public String fileUpload(@RequestParam("fileName") MultipartFile file , HttpServletRequest request){
        if(file.isEmpty()){
            return "false";
        }
        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);

        String path = "F:/test" ;
        File dest = new File(path + "/" + fileName);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
            return "true";
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return "false";
        }
    }



}
