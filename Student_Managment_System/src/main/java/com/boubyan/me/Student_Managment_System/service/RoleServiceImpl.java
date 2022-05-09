package com.boubyan.me.Student_Managment_System.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boubyan.me.Student_Managment_System.entity.ERole;
import com.boubyan.me.Student_Managment_System.entity.Role;
import com.boubyan.me.Student_Managment_System.exception.RoleNotFoundException;
import com.boubyan.me.Student_Managment_System.repository.RoleRepository;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	RoleRepository repo;

	@Override
	public Role findByRoleName(ERole roleName) {
		// TODO Auto-generated method stub
		return repo.findByRoleName(roleName).orElseThrow(() -> new RoleNotFoundException("Error: Role is not found."));
	}

	@Override
	public List<Role> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Role findById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Role update(Role role) {
		// TODO Auto-generated method stub
		Role updatedRole = findById(role.getId());
		if (updatedRole != null) {
			updatedRole.setId(role.getId());
			updatedRole.setRoleName(role.getRoleName());
			save(updatedRole);
		}

		return updatedRole;
	}

	@Override
	public Role save(Role role) {
		// TODO Auto-generated method stub
		return repo.save(role);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub

	}

}
