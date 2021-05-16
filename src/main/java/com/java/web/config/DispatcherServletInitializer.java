package com.java.web.config;

import javax.servlet.FilterRegistration.Dynamic;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	private static final String DISPATCH_OPTIONS_REQUEST = "dispatchOptionsRequest";

	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] { WebConfig.class, SpringDatabaseConfig.class };
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] { "/" };
	}

	protected void customizeRegistration(Dynamic registration) {
		registration.setInitParameter(DISPATCH_OPTIONS_REQUEST, Boolean.TRUE.toString());
	}
}