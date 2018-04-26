package com.pravin.tutorial.spring.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.validation.Validator;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = { "com.pravin.tutorial.spring.controller" })
public class WebConfig extends WebMvcConfigurerAdapter {

    @Bean
    public InternalResourceViewResolver resolver() {
	InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
	internalResourceViewResolver.setViewClass(JstlView.class);
	internalResourceViewResolver.setPrefix("/WEB-INF/views/");
	internalResourceViewResolver.setSuffix(".jsp");
	return internalResourceViewResolver;
    }

    @Bean
    public MessageSource messageSource() {
	ResourceBundleMessageSource bundleMessageSource = new ResourceBundleMessageSource();
	bundleMessageSource.setBasename("messages");
	return bundleMessageSource;
    }

    @Override
    public Validator getValidator() {
	LocalValidatorFactoryBean validator = new LocalValidatorFactoryBean();
	validator.setValidationMessageSource(messageSource());
	return validator;
    }

}
