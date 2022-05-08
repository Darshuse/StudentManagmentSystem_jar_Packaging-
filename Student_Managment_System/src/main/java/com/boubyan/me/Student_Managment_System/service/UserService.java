package com.boubyan.me.Student_Managment_System.service;

import java.util.List;
import java.util.Optional;

import com.boubyan.me.Student_Managment_System.entity.Course;
import com.boubyan.me.Student_Managment_System.entity.User;

public interface UserService {

	public List<User> findAll();

	public User findById(int userId);

	public User findByUserName(String userName);

	public User update(User user);

	public User save(User user);

	public List<Course> findCourseList(User user);

	public User findByEmail(String email);

	public Boolean existsByFirstName(String firstName);

	public Boolean existsByEmail(String email);

}
