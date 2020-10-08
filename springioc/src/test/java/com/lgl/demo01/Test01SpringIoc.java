package com.lgl.demo01;

import com.lgl.dao.PersonDao;
import com.lgl.domain.Person;
import com.lgl.service.PersonService;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.util.Date;

public class Test01SpringIoc {
    private static  final Logger log= LoggerFactory.getLogger(Test01SpringIoc.class);
    private    ClassPathXmlApplicationContext context;
    @Before
    public void init(){
        //1:创建ioc 容器对象  暂时看成map
        context=new ClassPathXmlApplicationContext("applicationContext.xml");
        //2:给定配置文件的名称 applicationContext.xml
    }
//    private static final Logger log = LoggerFactory.getLogger(Test01SpringIoc.class);

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

    @Test
    public void test10(){

        PersonService personService = (PersonService) context.getBean("personService");
        log.debug(personService+" test10");

        PersonDao personDao = (PersonDao) context.getBean("personDao");//id为类名首字符小写
        log.debug(personDao +" test10");
    }


}
