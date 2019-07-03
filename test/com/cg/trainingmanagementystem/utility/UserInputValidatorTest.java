package com.cg.trainingmanagementystem.utility;

import static org.junit.Assert.assertNotEquals;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cg.trainingmanagementystem.exception.InvalidFormatInput;

class UserInputValidatorTest {
	UserInputValidator uv = new UserInputValidator();  
	
//	@Test()
//	void courseIdLengthtest() throws InvalidFormatInput {
//		boolean result = uv.courseIdValidLength("CO_1001");
//		assertEquals(true,result);
//	}

	@Test
	void courseNotEmpty() throws  InvalidFormatInput {
		boolean result = uv.courseNameNotEmpty(null);
		assertEquals(true,result);
	}
////	
//	@Test
//	void courseNameValidTest() throws  InvalidFormatInput {
//		boolean result = uv.courseNameValid("25656");
//		assertNotEquals(false,result);
//	}
//	
//	@Test
//	void courseIdNotStartWithIneger() throws  InvalidFormatInput {
//		boolean result = uv.courseIdValidLength("1CD_201");
//		assertNotEquals(false,result);
//	}
//	
//	@Test
//	void courseIdNotEmpty() throws InvalidFormatInput {
//		boolean result = uv.courseIdNotEmpty(null);
//		assertNotEquals(true,result);
//	}
//	
//	@Test
//	void courseIdNotContainSpecaialCharacterExceptUnderScore() throws InvalidFormatInput {
//		boolean result = uv.courseIdNotEmpty("CD_@093");
//		assertNotEquals(true,result);
//	}
//	
//	@Test
//	void courseIdFormatTest() throws InvalidFormatInput {
//		boolean result = uv.courseIdValidLength("ST_250");
//		assertNotEquals(false,result);
//	}
//	
//	@Test
//	void courseNameFormatTest() throws InvalidFormatInput {
//		boolean result = uv.courseNameValid("Java12");
//		assertEquals(false,result);
//		
//	}
//	
//	@Test
//	void courseNameNotStartWithLowerCase() throws InvalidFormatInput {
//		boolean result = uv.courseNameValid("html");
//		assertNotEquals(false,result);
//	}

}
