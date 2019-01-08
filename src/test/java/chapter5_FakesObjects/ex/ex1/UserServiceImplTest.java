package chapter5_FakesObjects.ex.ex1;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class UserServiceImplTest {
	private UserServiceImpl userServiceImpl ;

	@Test
	public void assignPassword_getMd5PasswordAndPassItToUser_userShouldContainPassword() throws Exception {
		User user = mock(User.class);
		UserDAO userDao = mock(UserDAO.class);
		SecurityService securityService = mock(SecurityService.class);
		when(securityService.md5(user.getPassword())).thenReturn("new password");
		userServiceImpl = new UserServiceImpl(userDao, securityService);
		userServiceImpl.assignPassword(user);
		verify(user).setPassword("new password");
	}
	
	@Test
	public void assignPassword_getMd5Password_passwordShouldBeGenerated() throws Exception {
		SecurityService securityService = mock(SecurityService.class);
		when(securityService.md5(anyString())).thenReturn("new password");
		String password = securityService.md5("abc");
		final String EXPECTED_PASSWORD = "new password";
		assertEquals(EXPECTED_PASSWORD, password);
	}

}
