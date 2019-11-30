package com.dante.springweb.controller;

import com.dante.springweb.NeoProperties;
import com.dante.springweb.bean.UserBean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebConfiguration {

    @RequestMapping("/getUser")
    public UserBean getUser() {
        UserBean userBean = new UserBean();
        userBean.setName("dante");
        userBean.setAge(18);
        return userBean;
    }

    @RequestMapping("/getProperties")
    public NeoProperties getProperties() {
        return new NeoProperties();
    }
}
