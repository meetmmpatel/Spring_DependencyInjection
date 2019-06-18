package com.spring.dependencyInjection.Spring_DependencyInjection;

import com.spring.dependencyInjection.Spring_DependencyInjection.controller.ConstructorInjectedController;
import com.spring.dependencyInjection.Spring_DependencyInjection.controller.SetterInjection;
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
 
	System.out.println(cont.hashCode());
	System.out.println(contTwo.hashCode());
	
	
	//Using Setter Injection
	SetterInjection set = context.getBean(SetterInjection.class);
	set.processMessage("Setter Email injection ");
	
	//Without Spring
//	MessageService service = new EmailMessage();
//	service.sendMessage("Sending...");
  }
  
}
