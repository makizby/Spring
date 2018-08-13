package com.zby.homework.Repository;

import com.zby.homework.Entity.TeamPerson;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamPersonRepository extends JpaRepository<TeamPerson,String> {
}
