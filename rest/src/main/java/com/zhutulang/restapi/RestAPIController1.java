package com.zhutulang.restapi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/spittles")
public class RestAPIController1 {

    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public String showHomePage(@PathVariable("id") String id, Model model){
        System.out.println("aaa");
        return "{\"itsid\":\""+id+"\"}";
    }
}
