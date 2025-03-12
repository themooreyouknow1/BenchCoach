package com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.repository;

import com.moore.fantasybaseballhealper.com.moore.fantasybaseballhealper.model.Pitcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PitcherRepository extends JpaRepository<Pitcher, Long>, CrudRepository<Pitcher, Long> {
    List<Pitcher> findAll();
}
