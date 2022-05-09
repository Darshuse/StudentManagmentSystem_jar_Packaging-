package com.boubyan.me.Student_Managment_System.service;

import java.util.List;

import com.boubyan.me.Student_Managment_System.entity.Course;
import com.boubyan.me.Student_Managment_System.entity.User;
import com.boubyan.me.Student_Managment_System.entity.UserCourse;

public interface UserCourseService {
	public List<Course> findByUser(User user);

	public UserCourse register(UserCourse userCourse);

	public UserCourse findById(int userCourse);

	public void cancel(Course course, User user);

	public List<User> findByCourse(int course);

}
