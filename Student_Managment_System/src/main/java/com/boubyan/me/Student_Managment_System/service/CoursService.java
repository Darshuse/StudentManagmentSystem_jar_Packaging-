package com.boubyan.me.Student_Managment_System.service;

import java.util.List;
import javax.annotation.Resource;
import com.boubyan.me.Student_Managment_System.entity.Course;
import com.boubyan.me.Student_Managment_System.entity.User;
import com.boubyan.me.Student_Managment_System.entity.UserCourse;

public interface CoursService {

	public List<Course> findAll();

	public Course findById(int id);

	public Course update(Course course);

	public Course save(Course course);

	public void delete(Integer id);

	public UserCourse register(Course course);

	public List<User> findUserList(int courseId);

	public void cancel(int courseId);

}
