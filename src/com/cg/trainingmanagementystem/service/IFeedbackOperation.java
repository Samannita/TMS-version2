package com.cg.trainingmanagementystem.service;

import com.cg.trainingmanagementystem.service.bin.Feedback;
import com.cg.trainingmanagementystem.service.bin.TrainingProgram;

public interface IFeedbackOperation {

	public Feedback viewFeedbackReport();

	public Feedback viewDefaulterList(TrainingProgram trainingProgram, Feedback feedback);

}