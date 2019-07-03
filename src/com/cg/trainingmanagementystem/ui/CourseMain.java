package com.cg.trainingmanagementystem.ui;

import java.util.HashSet;


import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import com.cg.trainingmanagementsystem.dao.impl.DataBaseEntry;
import com.cg.trainingmanagementystem.exception.InvalidFormatInput;
import com.cg.trainingmanagementystem.service.ICourseOperation;
import com.cg.trainingmanagementystem.service.bean.Course;
import com.cg.trainingmanagementystem.service.impl.CourseOperationImpl;
import com.cg.trainingmanagementystem.services.CoordinatorService;

public class CourseMain {

	public static void main(String[] args) throws InvalidFormatInput {

		int choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("-------WELCOME TO TRAINING MANAGEMENT SYSTEM-------");
		System.out.println("====================================================");
		System.out.println("1.TRAINING PROGRAM MENU");
		System.out.println("2.COURSE OPERATION MENU");
		System.out.println("3.TRAINING MANAGEMENT MENU");
		System.out.println("4.FEEDBACK MANAGEMENT MENU");
		System.out.println("5.EXIT");
		System.out.println("ENTER YOUR CHOICE ");
		choice = scan.nextInt();

		switch (choice) {

		case 2:

			courseOperation();
			break;

		case 5:
			System.exit(0);

		default:
			System.out.println("Enter a valid choice");
			break;

		}
	}

	public static void courseOperation() throws InvalidFormatInput {
		// TODO Auto-generated method stub

		int ch;
		CoordinatorController coordinatorController = new CoordinatorController();
		System.out.println("-------WELCOME TO COURSE MENU-------");
		System.out.println("=====================================");
		System.out.println("1.Add Course");
		System.out.println("2.Delete Course");
		System.out.println("3.Get course details");
		System.out.println("4.details of course");
		System.out.println("5.Exit");
		try {
			Scanner scan = new Scanner(System.in);
			ch = scan.nextInt();

			switch (ch) {

			case 1:
				try {
					coordinatorController.addCourse();
				} catch (InvalidFormatInput e) {
					System.err.println(e.getMessage());

				}
				break;
//			
			case 2:
				coordinatorController.deleteCourse();

				break;

			case 3:
				coordinatorController.getCourseDetails();

				break;

			case 4:
				coordinatorController.retrieveCourse();
				break;

			case 5:
				System.exit(0);
				break;

			default:
				System.out.println("enter a valid choice");
				break;
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}
}
