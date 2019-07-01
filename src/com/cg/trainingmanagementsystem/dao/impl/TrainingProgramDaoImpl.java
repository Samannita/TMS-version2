package com.cg.trainingmanagementsystem.dao.impl; 
import java.util.*;

import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.service.bin.Course;
import com.cg.trainingmanagementystem.service.bin.TrainingProgram;

/**
 * 
 */
public class TrainingProgramDaoImpl implements ICrudOperation<TrainingProgram> {
	public boolean create(TrainingProgram o) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean update(TrainingProgram o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public TrainingProgram retrieve(TrainingProgram o) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean delete(TrainingProgram o) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HashSet<TrainingProgram> retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean create(Course course) throws CourseNullException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(Course course) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Course course) throws InvalidCourseIdException {
		// TODO Auto-generated method stub
		return false;
	}


//	@Override
//	public void addCourses(Set<Course> course) {
//		// TODO Auto-generated method stub
//		
//	}


}