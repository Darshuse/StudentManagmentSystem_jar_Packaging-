package com.boubyan.me.Student_Managment_System.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boubyan.me.Student_Managment_System.entity.ERole;
import com.boubyan.me.Student_Managment_System.entity.Role;

public interface RoleRepository  extends JpaRepository<Role, Integer>{

	Optional<Role> findByRoleName(ERole roleName);
}
