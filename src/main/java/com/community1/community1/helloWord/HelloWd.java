package com.community1.community1.helloWord;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWd {
    @GetMapping("/hello")
    public String hello(@RequestParam(name="name",value = "value") String name, Model model){
          model.addAttribute("name",name);



          return "hello";
    }

}
