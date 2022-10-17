package com.devlCafe.controller;


import com.devlCafe.chat.model.TempUser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpSession;

@Controller
@AllArgsConstructor
public class WebController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String main(HttpSession session){

        TempUser temps = new TempUser();
        temps.setUsername("김경준");
        
        session.setAttribute("temp",temps);

        return "index";
    }


    @RequestMapping(value="/login",method = RequestMethod.GET)
    public String main2(){
        return "login";
    }


}

