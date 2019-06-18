package com.spring.dependencyInjection.Spring_DependencyInjection.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class TwitterService implements MessageService{
  @Override
  public void sendMessage(String message) {
	System.out.println("TwitterService: " + message);
  }
}
