package project;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import project.controllers.Person;
import project.controllers.PersonController;
import repository.ProductRepository;

@SpringBootApplication
@ComponentScan(basePackages = {"project", "project.controllers", "repository", "service"})
@EnableJpaRepositories(basePackageClasses = ProductRepository.class)
public class MainClass 
{
	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
		
		 Person p1 = new Person(30,"Tarun","Vats"); Person p2 = new
		 Person(26,"Vikas","Vats"); Person p3 = new Person(17,"Harsh rsh","Vats");
		 Person p4 = new Person(27,"Kaku","Chaudhary"); PersonController.pList.add(p1); PersonController.pList.add(p2);
		 PersonController.pList.add(p3); PersonController.pList.add(p4);
		 
	}
}