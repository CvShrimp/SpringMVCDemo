package com.cvshrimp.mvcdemo.service;

import org.springframework.stereotype.Service;

import com.cvshrimp.mvcdemo.model.Course;

@Service
public interface CourseService {
	
	Course getCourseById(Integer courseId);

}
