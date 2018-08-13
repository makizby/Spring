package com.zby.homework.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zby_team_person")
public class TeamPerson {
    @Id
    private String pk_team_person;

    private String pk_team;

    private String pk_person;

    public String getPk_team_person() {
        return pk_team_person;
    }

    public void setPk_team_person(String pk_team_person) {
        this.pk_team_person = pk_team_person;
    }

    public String getPk_team() {
        return pk_team;
    }

    public void setPk_team(String pk_team) {
        this.pk_team = pk_team;
    }

    public String getPk_person() {
        return pk_person;
    }

    public void setPk_person(String pk_person) {
        this.pk_person = pk_person;
    }
}
