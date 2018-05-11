package com.udgrp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author kejw
 * @version V1.0
 * @Project phoenix-test
 * @Description: TODO
 * @date 2018/5/7
 */
@Service
public class QueryService {
    @Autowired
    @Qualifier("phoenixJdbcTemplate")
    JdbcTemplate phoenixJdbcTemplate;

    public List<Map<String, Object>> query() {
        String sql = "select YEHUMINGCHENG,count(*) COUNT from  \"DW_JTT_BD:DW_VEHICLE\" group by YEHUMINGCHENG";
        return phoenixJdbcTemplate.queryForList(sql);
    }
}
