
package com.cg.trainingmanagementystem.services;

import java.util.Set;

import com.cg.trainingmanagementsystem.dao.impl.DataBaseEntry;
import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;
import com.cg.trainingmanagementystem.exception.InvalidCourseNameException;
import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.IFeedbackOperation;
import com.cg.trainingmanagementystem.service.ITrainingProgramOperation;
import com.cg.trainingmanagementystem.service.bin.Course;
import com.cg.trainingmanagementystem.service.bin.Feedback;
import com.cg.trainingmanagementystem.service.bin.Student;
import com.cg.trainingmanagementystem.service.bin.TrainingProgram;
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

	public boolean addCourse(Course course) throws InvalidCourseIdException, InvalidCourseNameException {

		try {
			cc.addCourseController();
		} catch (CourseNullException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return false;
	}
	
public boolean deleteCourse(Course course) throws InvalidCourseIdException, InvalidCourseNameException {
		
		cc.deleteCourseController();
		
		return false;
	}
//
public boolean modifyCourse(Course course) throws InvalidCourseIdException, InvalidCourseNameException {
	
	cc.modifyCourseController();
	
	return false;
}

public void getAllCourse(){
	
	//return cc.getCourseDetailsController();
}

	

}