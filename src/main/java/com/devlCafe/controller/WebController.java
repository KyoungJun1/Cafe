package com.devlCafe.controller;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@AllArgsConstructor
public class WebController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String main(){



        return "index";
    }


    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String main2(){
        return "login";
    }


}

