package com.zsx;

import com.zsx.service.DemoService;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UnitTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(AppConfig.class);
		ac.refresh();


		DemoService demoService = ac.getBean(DemoService.class);
		System.out.println(demoService);
	}

}
