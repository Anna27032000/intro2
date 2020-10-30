package org.zviaghintseva.intro2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.zviaghintseva.intro2.implement.ReceiverImpl;
import org.zviaghintseva.intro2.implement.SenderImpl;
import org.zviaghintseva.intro2.implement.WirelessSenderImpl;
import org.zviaghintseva.intro2.interfaces.Receiver;
import org.zviaghintseva.intro2.interfaces.Sender;

@RestController
public class HomeController {
    private org.springframework.context.annotation.AnnotationConfigApplicationContext context;

    @RequestMapping(value = "/")
    public String home(){
        context=new AnnotationConfigApplicationContext(JavaConfig.class);
       Sender sender = context.getBean("wirelessSenderImpl", Sender.class);
       return sender.sendMessage("Message from JavaConfig");

    }
}
