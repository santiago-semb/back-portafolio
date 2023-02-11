package com.example.backportfolio.Repository;

import com.example.backportfolio.Entity.DueñoProyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IDueñoRepository extends JpaRepository<DueñoProyecto, Long> {
    
}

