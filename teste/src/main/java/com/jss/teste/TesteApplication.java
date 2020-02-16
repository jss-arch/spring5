package com.jss.teste;

import com.jss.teste.config.FakeDataSource;
import com.jss.teste.config.PropertyConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@SpringBootApplication
//@EnableConfigurationProperties
public class TesteApplication {

//	@Value("${string.teste}")
//	static String teste;

	public static void main(String[] args) {
//		String teste = "teste.teste";
//		System.out.println(teste.substring(0, teste.indexOf(".")));

		ApplicationContext applicationContext = SpringApplication.run(TesteApplication.class, args);

		FakeDataSource fakeDataSource = applicationContext.getBean(FakeDataSource.class);

		System.out.println("Teste" + fakeDataSource.getTeste());
		System.out.println("Basepath: " + fakeDataSource.getBasePath());

		//PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = PropertyConfig.properties();


	}

}
