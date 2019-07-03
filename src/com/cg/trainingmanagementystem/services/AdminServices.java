package com.cg.trainingmanagementystem.services;


import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.IFeedbackOperation;
import com.cg.trainingmanagementystem.service.ITrainerManagement;
import com.cg.trainingmanagementystem.service.bean.Course;
import com.cg.trainingmanagementystem.service.bean.Feedback;
import com.cg.trainingmanagementystem.service.bean.Trainer;

public class AdminServices {

	private Trainer trainer;

	private IFeedbackOperation feedbackOperation;

	private ITrainerManagement trainerManagement;

	private ICourseOperation courseOperation;

	private Course course;

	private Feedback feedback;

	private String generateTrainerId() {

		return "";
	}

}