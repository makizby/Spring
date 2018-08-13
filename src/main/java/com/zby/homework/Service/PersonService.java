package com.zby.homework.Service;

import com.zby.homework.Entity.Person;
import com.zby.homework.Repository.PersonRepository;
import com.zby.homework.enums.ResultEnum;
import com.zby.homework.exception.PersonException;
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
            throw new PersonException(ResultEnum.LESS_THAN_18);
        }else if(age>25){
            throw new PersonException(ResultEnum.BIGGER_THAN_25);
        }
    }
}
