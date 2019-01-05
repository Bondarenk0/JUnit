package chapter4_TDD.exercises.ex1;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordValidatorTest {

	@Test
	public void validate_passPasswordWithoutUnderscore_mustReturnFalse() {
		String passwordWithouUnderscore = "sdfdfs";
		assertFalse(PasswordValidator.validate(passwordWithouUnderscore));
	}
	
	@Test
	public void validate_passNullPassword_mustReturnFalse() {	
		assertFalse("password must be not null", PasswordValidator.validate(null));
	}
	
	@Test
	public void validate_passEmptyPassword_mustReturnFalse() {
		String emptyPassword = "";
		assertFalse("password must be not empty", PasswordValidator.validate(emptyPassword));
	}
	
	@Test
	public void validate_pass6CharLengthPassword_mustBeMoreThen6Characters() {
		String shortPassword = "_23456";
		assertFalse("password must be more then 6 characters", PasswordValidator.validate(shortPassword));
	}

}
