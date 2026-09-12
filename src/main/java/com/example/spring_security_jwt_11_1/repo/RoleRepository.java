package com.example.spring_security_jwt_11_1.repo;

import com.example.spring_security_jwt_11_1.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Set<Role> findByUserId(Long userId);
}
