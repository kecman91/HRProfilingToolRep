package app;

import model.TagCloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import repository.TagCloudRepository;

@SpringBootApplication
public class Application {
	@Autowired
    TagCloudRepository repository;
	public static void main(String[] args) {
		
		SpringApplication.run(Application.class);
		
		
        /*ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }*/
		
		
		
		
    }
	 public void run(String... strings) throws Exception {
		 TagCloud tc = new TagCloud();
		 
		 tc.setNameTagCloud("Java");
		 tc.setTipTagCloud("programming language");
		 repository.save( tc);
		 
		 tc = new TagCloud();
		 
		 tc.setNameTagCloud("C#");
		 tc.setTipTagCloud("programming language");
		 repository.save( tc);
		 
		 tc = new TagCloud();
		 
		 tc.setNameTagCloud("C++");
		 tc.setTipTagCloud("programming language");
		 repository.save( tc);
		 
		 	System.out.println("tcs found with findAll():");
	        System.out.println("-------------------------------");
	        for (TagCloud tc1 : repository.findAll()) {
	            System.out.println(tc1.getNameTagCloud() + " ID:  " + tc1.getIdTagCloud());
	        }
	        System.out.println();
		 
		 
	 }
	
}
