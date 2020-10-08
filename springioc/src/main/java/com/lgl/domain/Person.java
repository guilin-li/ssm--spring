package com.lgl.domain;

import java.util.Date;

public class Person {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private int id;
    private String name;
    private int age;
    private Date birthday;

    //集合类型属于复杂类型
    private String[] arr; //女朋友们
    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public String[] getArr() {
        return arr;
    }
///*
//
//    //List
//    private List<String> list;//前女朋友们
//    public void setList(List<String> list) {
//        this.list = list;
//    }
//
//    //set
//    private Set<String> set;//前女朋友们
//    public void setSet(Set<String> set) {
//        this.set = set;
//    }
//
//    //map
//    private Map<String,String> map;//前女朋友们
//    public void setMap(Map<String, String> map) {
//        this.map = map;
//    }
//
//    //properties
//    private Properties properties;//前女朋友们
//    public void setProperties(Properties properties) {
//        this.properties = properties;
//    }
//*/

    public void init(){
        System.out.println("哇哇...");
    }
    public void eat(){
        System.out.println("吃食堂...");
    }
    public void destory(){
        System.out.println("呜呜...");
    }
    public Person() {
    }

    public Person(int id, String name, int age, Date birthday) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

  /*  @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        System.out.println("setId");
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
