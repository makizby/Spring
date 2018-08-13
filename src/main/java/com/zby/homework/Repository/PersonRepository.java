package com.zby.homework.Repository;

import com.zby.homework.Entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person,String> {
    Person findPersonByCode(String code);
}
