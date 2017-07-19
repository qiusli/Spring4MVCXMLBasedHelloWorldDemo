package com.websystique.springmvc.controller.HelloWorldController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Qiushi on 7/17/2017.
 */
@Controller
public class HelloWorldController {
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello(ModelMap modelMap) {
        modelMap.addAttribute("greeting", "hello world from spring mvc 4");
        return "welcome";
    }

    @RequestMapping(value = "/helloAgain", method = RequestMethod.GET)
    public String sayHelloAgain(ModelMap modelMap) {
        modelMap.addAttribute("greeting", "hello world from spring mvc 4 again");
        return "welcome";
    }
}
