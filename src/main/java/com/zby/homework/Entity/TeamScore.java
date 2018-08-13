package com.zby.homework.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "zby_team_score")
public class TeamScore {
    @Id
    private String pk_team_b;

    private String task;

    private int score;

    private String pk_team;

    public String getPk_team_b() {
        return pk_team_b;
    }

    public void setPk_team_b(String pk_team_b) {
        this.pk_team_b = pk_team_b;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getPk_team() {
        return pk_team;
    }

    public void setPk_team(String pk_team) {
        this.pk_team = pk_team;
    }
}
