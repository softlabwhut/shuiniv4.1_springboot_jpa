package com.whut.springbootjpacementv4_1.controller;


import com.whut.springbootjpacementv4_1.api.GlobalConfig;
import com.whut.springbootjpacementv4_1.bean.Result;
import com.whut.springbootjpacementv4_1.entity.QuestionnaireDiaoyan;
import com.whut.springbootjpacementv4_1.service.QuestionnaireDiaoyanServiceImp;
import com.whut.springbootjpacementv4_1.view.FormPdfview;
import com.whut.springbootjpacementv4_1.view.Pdfview;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;


/**
 * @author chen
 * 测试
 */

@Controller
public class DemoController {

    @Autowired
    QuestionnaireDiaoyanServiceImp questionnaireDiaoyanServiceImp;

    @RequestMapping("/export")
    public ModelAndView demo3(QuestionnaireDiaoyan questionnaireDiaoyan,
                              @RequestParam(name = "page", required = false, defaultValue = "0") int page,
                              @RequestParam(name = "size", required = false, defaultValue = "10") int size) {

        Page<QuestionnaireDiaoyan> res = questionnaireDiaoyanServiceImp.query(questionnaireDiaoyan, page, size);
        Map<String, Object> globalModel = new HashMap<>();
        globalModel.put("data", res.getContent());
        return new ModelAndView(new FormPdfview(), globalModel);
    }


    @RequestMapping("/query")
    public String demo2() {
        return "JiLian";
    }

    /**
     * Handle request to download a PDF document
     */
    @RequestMapping(value = "/sample", method = RequestMethod.GET)
    public ModelAndView downloadSample() {
        Map<String, Object> globalModel = new HashMap<>();
        globalModel.put("status", true);
        globalModel.put("code", "data");
        globalModel.put("message", "data");

        return new ModelAndView(new Pdfview(), globalModel);
    }

    @RequestMapping(value = "/download", method = RequestMethod.GET)
    public ModelAndView downloadForm() {
        Map<String, Object> globalModel = new HashMap<>();
        globalModel.put("mobile", GlobalConfig.readProperty("form.mobile"));
        globalModel.put("email", GlobalConfig.readProperty("form.email"));
        globalModel.put("name", GlobalConfig.readProperty("form.name"));
        globalModel.put("mode", "pdf");

        // return a view which will be resolved by an excel view resolver
        //   return new ModelAndView("simpleFormPDF", globalModel);
        return new ModelAndView(new FormPdfview(), globalModel);
    }
}
