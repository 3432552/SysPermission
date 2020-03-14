package com.wzh.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: wzh
 * @ClassName: TestController
 * @Description:
 * @Date: 2020/3/14 18:46
 */
@Controller
public class TestController {
    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @RequestMapping("/index")
    @ResponseBody
    public String name() {
        return "Hello World!----------";
    }

    @RequestMapping("/content")
    public String name1() {
        log.info("content内容------------。");
        return "content";
    }
}
