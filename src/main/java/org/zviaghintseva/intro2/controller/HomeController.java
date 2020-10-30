package org.zviaghintseva.intro2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zviaghintseva.intro2.implement.ReceiverImpl;
import org.zviaghintseva.intro2.implement.SenderImpl;
import org.zviaghintseva.intro2.implement.WirelessSenderImpl;
import org.zviaghintseva.intro2.interfaces.Receiver;
import org.zviaghintseva.intro2.interfaces.Sender;

@RestController
public class HomeController {
  @Autowired
    private org.springframework.web.context.WebApplicationContext context;

    @RequestMapping(value = "/")
    public String home(){
       Sender sender = context.getBean("sender", Sender.class);
       return sender.sendMessage("My Message");

    }
}
