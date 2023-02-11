package com.example.backportfolio.Security.Repository;

import com.example.backportfolio.Security.Entity.Rol;
import com.example.backportfolio.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer> {
    
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}

