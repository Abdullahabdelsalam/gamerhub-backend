package com.abdullah.gamerhub.repository;

import com.abdullah.gamerhub.entity.Role;
import com.abdullah.gamerhub.entity.enums.RoleName;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(RoleName name);
}
