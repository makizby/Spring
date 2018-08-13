package com.zby.homework.Entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Table(name = "zby_person")
public class Person {
    @Id
    @Column(name = "pk_person")
    private String pk_person;

    private String code;

    private String name;

    private int sex;

    @Min(value = 18,message = "未满18")
    private int age;

   // @ManyToOne
  //  @JoinColumn(name = "pk_team")
    //private Team team;

    public Person(){}

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPk_person() {
        return pk_person;
    }

    public void setPk_person(String pk_person) {
        this.pk_person = pk_person;
    }

}
