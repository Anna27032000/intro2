package org.zviaghintseva.intro2.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.zviaghintseva.intro2.implement.ReceiverImpl;
import org.zviaghintseva.intro2.implement.SenderImpl;
import org.zviaghintseva.intro2.implement.WirelessSenderImpl;
import org.zviaghintseva.intro2.interfaces.Receiver;
import org.zviaghintseva.intro2.interfaces.Sender;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class HomeController {
    private org.springframework.context.annotation.AnnotationConfigApplicationContext context;
private Collection<User> users = new ArrayList<>();
      @RequestMapping(value = "/{name}")
    public String home(@PathVariable("name") String name,
                       Model model){
        context=new AnnotationConfigApplicationContext(JavaConfig.class);
       Sender sender = context.getBean("wirelessSenderImpl", Sender.class);
       model.addAttribute("msg", sender.sendMessage("Hello "+name+"!"));
       return "test";

    }
    @RequestMapping(value = "/users")
    public String getUsers(Model model){
          model.addAttribute("user", users);
        return "users";
    }
    @GetMapping(value = "/")
    public String getSingUp(Model model){
          model.addAttribute("user", new User());
          return "sing_up";
    }
    @PostMapping(value = "/")
        public String getSingUp(@ModelAttribute @Valid User user, BindingResult result){
          if (result.hasErrors()){
              return "sing_up";
          }
          users.add(user);
          return "redirect:/users";
        }
}
