package org.timon.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Timon
 * @date 2022/6/14 10:27
 */
@Configuration
@ComponentScan("org.timon.beans")
public class MainStart {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MainStart.class);
		DemoServiceImpl bean = context.getBean(DemoServiceImpl.class);
		bean.helloWorld();
	}
}
