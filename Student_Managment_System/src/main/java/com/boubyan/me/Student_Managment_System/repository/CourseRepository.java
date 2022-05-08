package com.boubyan.me.Student_Managment_System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.boubyan.me.Student_Managment_System.entity.Course;

@Repository
@Transactional
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
