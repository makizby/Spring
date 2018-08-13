package com.zby.homework.Repository;

import com.zby.homework.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team,String> {
    Team findTeamByCode(String code);
    //Team findTeamByPk_team(String pk_team);
}
