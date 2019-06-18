package com.spring.dependencyInjection.Spring_DependencyInjection.controller;

import com.spring.dependencyInjection.Spring_DependencyInjection.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller
@Scope("singleton")
public class ConstructorInjectedController {
  
  private MessageService messageService;
  
  @Autowired
  public ConstructorInjectedController(@Qualifier("emailMessage")MessageService messageService) {
    super();
	System.out.println("This is Constructor based Injections");
	this.messageService = messageService;
  }
  
  public void processMessage(String message){
   messageService.sendMessage(message);
  }
}
