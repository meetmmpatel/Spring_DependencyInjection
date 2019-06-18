package com.spring.dependencyInjection.Spring_DependencyInjection;

import com.spring.dependencyInjection.Spring_DependencyInjection.controller.ConstructorInjectedController;
import com.spring.dependencyInjection.Spring_DependencyInjection.controller.SetterInjection;
import com.spring.dependencyInjection.Spring_DependencyInjection.service.EmailMessage;
import com.spring.dependencyInjection.Spring_DependencyInjection.service.TwitterService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {
  
  public static void main(String[] args) {
	ApplicationContext context =
			SpringApplication.run(SpringDependencyInjectionApplication.class, args);
	
	//Using Constructor Injection
	ConstructorInjectedController cont =
			context.getBean(ConstructorInjectedController.class);
	cont.processMessage("email");
	
	ConstructorInjectedController contTwo =
			context.getBean(ConstructorInjectedController.class);
	contTwo.processMessage("Sending Message");
 
	System.out.println("ConstructorInjectedController ObjOne: " + cont.hashCode());
	System.out.println("ConstructorInjectedController ObjTwo: " +contTwo.hashCode());
 
	EmailMessage emailMessage = context.getBean(EmailMessage.class);
	EmailMessage emailMessageTwo = context.getBean(EmailMessage.class);
	System.out.println(emailMessage.hashCode());
	System.out.println(emailMessageTwo.hashCode());
 
	TwitterService twitterService = context.getBean(TwitterService.class);
	System.out.println(twitterService.hashCode());
	
	//Using Setter Injection
	SetterInjection set = context.getBean(SetterInjection.class);
	set.processMessage("Setter Email injection ");
	
	//Without Spring
//	MessageService service = new EmailMessage();
//	service.sendMessage("Sending...");
  }
  
}
