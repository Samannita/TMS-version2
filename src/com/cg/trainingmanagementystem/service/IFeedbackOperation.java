package com.cg.trainingmanagementystem.service;

import com.cg.trainingmanagementystem.service.bean.Feedback;
import com.cg.trainingmanagementystem.service.bean.TrainingProgram;

public interface IFeedbackOperation {

	public Feedback viewFeedbackReport();

	public Feedback viewDefaulterList(TrainingProgram trainingProgram, Feedback feedback);

}