package com.spring.dependencyInjection.Spring_DependencyInjection.service;


import org.springframework.stereotype.Service;


@Service
public class EmailMessage implements MessageService {
  @Override
  public void sendMessage(String message) {
	System.out.println("Email Service: " + message);
	
  }
}
