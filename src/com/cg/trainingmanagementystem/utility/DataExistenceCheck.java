package com.cg.trainingmanagementystem.utility;

import java.util.Iterator;
import java.util.Set;

import com.cg.trainingmanagementsystem.dao.impl.DataBaseEntry;
import com.cg.trainingmanagementystem.service.bin.Course;

public class DataExistenceCheck {
	public static boolean DataExistenceCheck(String courseId) {
		boolean result=false;
		Set<Course> course=DataBaseEntry.course;
		Iterator value = course.iterator();
		while(value.hasNext()) {
			Course courses = (Course)value.next();
			if(courses.getCourseId().equalsIgnoreCase(courseId)) {
				String cId=courses.getCourseId();
				System.out.println(courses.getCourseId());
					//System.out.println(cId);
				
			}
		}
		
		return result;
	}

}
