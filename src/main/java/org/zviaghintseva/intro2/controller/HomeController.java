package org.zviaghintseva.intro2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zviaghintseva.intro2.implement.ReceiverImpl;
import org.zviaghintseva.intro2.implement.SenderImpl;
import org.zviaghintseva.intro2.interfaces.Receiver;
import org.zviaghintseva.intro2.interfaces.Sender;

@RestController
public class HomeController {
    private final Receiver receiver;
    private final Sender sender;
    public HomeController(){
        this.receiver=new ReceiverImpl();
        this.sender=new SenderImpl( receiver);

    }
    @RequestMapping(value = "/")
    public String home(){
        return sender.sendMessage("Hello world");
    }
}
