package org.zviaghintseva.intro2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.zviaghintseva.intro2.implement.ReceiverImpl;
import org.zviaghintseva.intro2.implement.SenderImpl;
import org.zviaghintseva.intro2.implement.WirelessSenderImpl;
import org.zviaghintseva.intro2.interfaces.Receiver;
import org.zviaghintseva.intro2.interfaces.Sender;

@Controller
public class HomeController {
    private org.springframework.context.annotation.AnnotationConfigApplicationContext context;

    @RequestMapping(value = "/")
    public String home(@RequestParam(value = "name", required = false, defaultValue = "stranger")String name,
                       Model model){
        context=new AnnotationConfigApplicationContext(JavaConfig.class);
       Sender sender = context.getBean("wirelessSenderImpl", Sender.class);
       model.addAttribute("msg", sender.sendMessage("Hello "+name+"!"));
       return "test";

    }
}
