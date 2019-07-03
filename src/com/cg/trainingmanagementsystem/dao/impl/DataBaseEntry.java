package com.cg.trainingmanagementsystem.dao.impl;

import java.util.HashSet;
import java.util.Set;

import com.cg.trainingmanagementystem.service.bean.Course;


public class DataBaseEntry {

	public static HashSet<Course> course= new HashSet<Course>();
	public static Set<Course> infoDb() {
		course.add(new Course("CD_201","JAVA","It is a object orieneted prgramming lang",2500));
		course.add(new Course("CD_202","C","It is a prgramming lang",2000));
		course.add(new Course("CD_203","C++","It is programming lang",2600));
		course.add(new Course("CD_204","C#","It is programming lang",1000));
		course.add(new Course("CD_205","Html","We can create web pages",2050));
		course.add(new Course("CD_206","Python","It can be used on a server to create web applications.",3000));
		course.add(new Course("CD_207","Android","We can develop app",5000));
		course.add(new Course("CD_208","PHP","It is a serverScripting lang",3500));
		System.out.println(course);
		return course;
	

	}
}
