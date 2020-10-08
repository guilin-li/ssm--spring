package com.lgl.demo01;

import com.lgl.domain.Person;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Test01SpringIoc {
    @Test
    public void test01(){
        //1:创建ioc 容器对象  暂时看成map
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2:给定配置文件的名称 applicationContext.xml
        //3:调用容器的getBean方法获取id对应的对象
        Person person = (Person) context.getBean("person3");
//        Person person2 = context.getBean("person2",Person.class);
        System.out.println(person);
//        System.out.println(person2);
    }
    @Test
    public void test02(){
        Person person1 = new Person();
        person1.setId(1);
        System.out.println(person1);

        Person person2 = new Person(1,"Tony",18,new Date());
        System.out.println(person2);
    }
}
