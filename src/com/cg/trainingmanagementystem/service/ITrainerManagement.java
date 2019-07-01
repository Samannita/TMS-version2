package com.cg.trainingmanagementystem.service;

import java.util.*;

import com.cg.trainingmanagementystem.service.bin.Trainer;
import com.cg.trainingmanagementystem.service.enumv.Skills;

/**
 * 
 */
public interface ITrainerManagement {

	/**
	 * 
	 */
	public boolean addSkillsToTrainer( String trainerId, Skills skill);

	/**
	 * 
	 */
	public boolean delSkillsToTrainer( String trainerId, Skills skills);

	/**
	 * 
	 */
	public Trainer getTrainerDetails(Trainer trainer);

	/**
	 * 
	 */
	public HashSet<Trainer> getAllTrainers();

	/**
	 * 
	 */
	public boolean createTrainer(Trainer trainer);

}