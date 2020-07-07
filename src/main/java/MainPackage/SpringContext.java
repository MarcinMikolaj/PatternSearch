package MainPackage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;

@Configuration
@ComponentScan(basePackages = "MainPackage")
public class SpringContext {

	public static void main(String...args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringContext.class);
		RabinKarpAlgorithm algorithm = context.getBean(RabinKarpAlgorithm.class);
		algorithm.search("AABAB", "B", 23);
		context.close();
		
	}
}
