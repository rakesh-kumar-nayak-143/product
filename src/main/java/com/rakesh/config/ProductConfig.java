package com.rakesh.config;

import javax.swing.plaf.basic.BasicToolBarUI.DockingListener;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sun.xml.bind.v2.schemagen.xmlschema.Documentation;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class ProductConfig {

	@Bean
	public Docket apiDoc() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.rakesh.controller"))
				.paths(PathSelectors.any())
				.build();
	}
}
