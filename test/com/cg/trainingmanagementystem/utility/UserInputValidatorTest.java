package com.cg.trainingmanagementystem.utility;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.trainingmanagementystem.exception.CourseNameNullException;
import com.cg.trainingmanagementystem.exception.CourseNullException;
import com.cg.trainingmanagementystem.exception.InvalidCourseIdException;

class UserInputValidatorTest {
	UserInputValidator uv = new UserInputValidator();  
	
	@Test()
	void courseIdLengthtest()  {
		String result = uv.courseIdValidLength("CD_201");
		assertEquals("CD_201",result);
	}

	@Test
	void courseNotEmpty() throws CourseNameNullException, CourseNullException {
		String result = uv.courseNameNotEmpty(null);
		assertEquals(null,result);
	}
//	
	@Test
	void courseNameValidTest() {
		String result = uv.courseNameValid("25656");
		assertNotEquals("CD_201",result);
	}
	
	@Test
	void courseIdNotStartWithIneger() {
		String result = uv.courseIdValidLength("1CD_201");
		assertNotEquals("CD_201",result);
	}
	
	@Test
	void courseIdNotEmpty() {
		String result = uv.courseIdNotEmpty(null);
		assertNotEquals("CD_209",result);
	}
	
	@Test
	void courseIdNotContainSpecaialCharacterExceptUnderScore() {
		String result = uv.courseIdNotEmpty("CD_@093");
		assertNotEquals("CD_209",result);
	}
	
	@Test
	void courseIdFormatTest() {
		String result = uv.courseIdValidLength("ST_250");
		assertNotEquals("CD_201",result);
	}
	
	@Test
	void courseNameFormatTest() {
		String result = uv.courseNameValid("Java12");
		assertNotEquals("Java",result);
		
	}
	
	@Test
	void courseNameNotStartWithLowerCase() {
		String result = uv.courseNameValid("html");
		assertNotEquals("Html",result);
	}
}
