package com.lgl.dao;

import com.lgl.domain.Person;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDao {
    public Person find(Person p) {
        if("jack".equals(p.getUsername())&&"12345".equals(p.getPassword())){
            return p;
        }else{
            return null;
        }
    }
}
