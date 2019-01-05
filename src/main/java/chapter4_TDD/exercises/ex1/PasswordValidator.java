package chapter4_TDD.exercises.ex1;

public class PasswordValidator {

	public static boolean validate(String password) {
		if(password == null || password.isEmpty()) {
			return false;
		}
		
		if(password.length() < 7) {
			return false;
		}
		
		if(!password.contains("_")) {
			return false;
		}
		
		return true;
	}

}
