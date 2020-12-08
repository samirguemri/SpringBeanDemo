package edu.samir.demo.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext annotationContext = new AnnotationConfigApplicationContext(ConfigClass.class);
        User samirAnnotation = annotationContext.getBean("user", User.class);
        System.out.println(samirAnnotation);

        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("userBean.xml");
        User samirXml = xmlContext.getBean("samir", User.class);
        System.out.println(samirXml);

    }
}
