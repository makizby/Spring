package com.zby.homework.Service;

import com.zby.homework.Entity.Person;
import com.zby.homework.Repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonService  {
    @Autowired
    private PersonRepository personRepository;

    public void getAge(String code) throws Exception{
        Person person = personRepository.findPersonByCode(code);
        Integer age = person.getAge();
        if(age<18){
            throw new Exception("没有满18");
        }else if(age>25){
            throw new Exception("大于25岁");
        }
    }
}
