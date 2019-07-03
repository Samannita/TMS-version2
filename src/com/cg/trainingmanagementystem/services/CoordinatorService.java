
package com.cg.trainingmanagementystem.services;

import java.util.Set;


import com.cg.trainingmanagementsystem.dao.impl.DataBaseEntry;

import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.IFeedbackOperation;
import com.cg.trainingmanagementystem.service.ITrainingProgramOperation;
import com.cg.trainingmanagementystem.service.bean.Course;
import com.cg.trainingmanagementystem.service.bean.Feedback;
import com.cg.trainingmanagementystem.service.bean.Student;
import com.cg.trainingmanagementystem.service.bean.TrainingProgram;
import com.cg.trainingmanagementystem.service.impl.CourseOperationImpl;
import com.cg.trainingmanagementystem.ui.CoordinatorController;

public class CoordinatorService {


	private ICourseOperation courseOperation;
	private ITrainingProgramOperation trainingProgramOperation;
	private IFeedbackOperation feedbackOperation;
	private Feedback feedback;
	private TrainingProgram trainingProgram;
	private Course course;
	
	
			
		
	
	CoordinatorController cc = new CoordinatorController();

//	public boolean addCourse(Course course) throws InvalidCourseIdException, InvalidCourseNameException {
//
//		try {
//			//cc.addCourseController();
//		} catch (CourseNullException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		return false;
//	}
//	
//public boolean deleteCourse(Course course) throws InvalidCourseIdException, InvalidCourseNameException {
//		
//		cc.deleteCourseController();
//		
//		return false;
//	}
////
//public boolean modifyCourse(Course course) throws InvalidCourseIdException, InvalidCourseNameException {
//	
//	cc.modifyCourseController();
//	
//	return false;
//}
//
//public void getAllCourse(){
//	
//	//return cc.getCourseDetailsController();
//}
//
//	

}