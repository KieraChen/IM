package com.util;

import com.model.Operator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author chenqi
 * @desc
 * @since 2019-03-31 21:24
 */
public class Tool {
    public static Map<String, String> checkLogin(Operator operator){
        Map<String,String> map = new HashMap<String,String>();
        if(operator.getSzSignOnName()==null || operator.getSzSignOnName().trim()=="" ){
            map.put("username", "用户名不能为空！");
        }
        if(operator.getSzSignOnPassword()==null || operator.getSzSignOnPassword().trim()==""){
            map.put("password", "密码不能为空！");
        }

        return map;

    }
}
