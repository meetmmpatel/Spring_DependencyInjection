package com.spring.dependencyInjection.Spring_DependencyInjection.service;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


@Service
@Scope("singleton")
public class EmailMessage implements MessageService {
  @Override
  public void sendMessage(String message) {
	System.out.println("Email Service: " + message);
	
  }
}
