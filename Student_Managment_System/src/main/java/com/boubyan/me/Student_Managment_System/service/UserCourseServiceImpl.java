package com.boubyan.me.Student_Managment_System.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boubyan.me.Student_Managment_System.entity.Course;
import com.boubyan.me.Student_Managment_System.entity.User;
import com.boubyan.me.Student_Managment_System.entity.UserCourse;
import com.boubyan.me.Student_Managment_System.entity.UserCoursePK;
import com.boubyan.me.Student_Managment_System.repository.UserCourseRepository;

@Service
public class UserCourseServiceImpl implements UserCourseService {

	@Autowired
	UserCourseRepository repo;

	@Override
	public List<Course> findByUser(User user) {
		// TODO Auto-generated method stub
		List<Course> studentCourseList = repo.findByUser(user.getId());
		return studentCourseList;
	}
	
	

	@Override
	public UserCourse register(UserCourse userCourse) {
		// TODO Auto-generated method stub
		return  repo.save(userCourse);
	}

	@Override
	public void cancel(Course course,User user) {
		// TODO Auto-generated method stub
		Optional<UserCourse> userCourse=repo.findByUserAndCourse(user.getId(),course.getId());
       repo.deleteByUserAndCourse(user.getId(),course.getId());
	}

	@Override
	public List<User> findByCourse(int courseId) {
		// TODO Auto-generated method stub
		List<User> userList = repo.findByCourse(courseId);
		return userList;
	}



	@Override
	public UserCourse findById(int userCourse) {
		// TODO Auto-generated method stub
		return repo.findById(userCourse).orElse(null);
	}




}
