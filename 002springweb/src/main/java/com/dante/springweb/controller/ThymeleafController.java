package com.dante.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * 请求回调跳转带html，使用Controller注解，WebConfiguration Filter
 */
@Controller
public class ThymeleafController {

    @RequestMapping("/sayHi")
    public String sayHi(Locale locale, Model model) {
        model.addAttribute("greeting", "Hello!");

        Date date = new Date();
        DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
        String formattedDate = dateFormat.format(date);
        model.addAttribute("currentTime", formattedDate);

        return "hello";
    }
}
