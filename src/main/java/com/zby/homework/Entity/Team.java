package com.zby.homework.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zby_team")
public class Team {
    @Id
    private String pk_team;
    private String code;
    private String name;
    private String slogan;
    private int score;
    public Team(){}

    public String getPk_team() {
        return pk_team;
    }

    public void setPk_team(String pk_team) {
        this.pk_team = pk_team;
    }

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

    public String getSlogan() {
        return slogan;
    }

    public void setSlogan(String slogan) {
        this.slogan = slogan;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
