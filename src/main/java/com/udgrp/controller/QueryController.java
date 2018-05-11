package com.udgrp.controller;

import com.udgrp.service.QueryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author kejw
 * @version V1.0
 * @Project phoenix-test
 * @Description: TODO
 * @date 2018/5/7
 */


@Controller
@RequestMapping("/action")
public class QueryController {

    @Autowired
    QueryService queryService;

    /**
     * 查询
     */
    @ResponseBody
    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public Object query() {
        return queryService.query();
    }
}














