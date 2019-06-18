package com.spring.dependencyInjection.Spring_DependencyInjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class TextMessage implements MessageService {
  @Override
  public void sendMessage(String message) {
	System.out.println("Text Message: " + message);
	
  }
}
