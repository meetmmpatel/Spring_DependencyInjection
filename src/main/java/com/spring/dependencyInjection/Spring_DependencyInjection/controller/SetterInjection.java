package com.spring.dependencyInjection.Spring_DependencyInjection.controller;

import com.spring.dependencyInjection.Spring_DependencyInjection.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjection {
  
  private MessageService messageService;
  
  @Autowired
  @Qualifier("twitterService")
  public void setMessageService(MessageService messageService) {
	this.messageService = messageService;
  }
  
  public void processMessage(String message){
	messageService.sendMessage(message);
  }
}
