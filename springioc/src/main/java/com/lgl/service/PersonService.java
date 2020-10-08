package com.lgl.service;

import com.lgl.dao.PersonDao;
import com.lgl.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private static  final Logger log= LoggerFactory.getLogger(PersonService.class);
    //private PersonDao personDao = new PersonDao();
    //第一种：@Autowired  要么 @Autowired与 @Qualifier("personDao")
    //第二种：@Value("#{bean的id}")
    //第三种：@Resource(name="bean的id值")

    @Autowired
    PersonDao personDao;

    public void setPersonDao(PersonDao personDao) {
        this.personDao = personDao;
    }

    public boolean login(Person p) {
        log.debug(p+" login");
        Person person = personDao.find(p);
        if(person==null) {
            return false;
        }else{
            return true;
        }

    }

}
