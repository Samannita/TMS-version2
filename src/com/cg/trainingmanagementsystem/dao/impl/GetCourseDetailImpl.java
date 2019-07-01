package com.cg.trainingmanagementsystem.dao.impl;

import java.util.HashSet;
import java.util.Set;

import com.cg.trainingmanagementystem.service.bin.Course;

public class GetCourseDetailImpl implements IGetAll<Course>{
	
public Set<Course> retrieveAll(){
	Set<Course> cor = DataBaseEntry.course;
	return cor;
}

}
