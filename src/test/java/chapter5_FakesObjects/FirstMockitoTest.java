package chapter5_FakesObjects;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import org.hamcrest.core.Is;
import org.junit.Test;

public class FirstMockitoTest {
	private Car myFerrari = mock(Car.class);

	@Test
	public void test() {
		assertTrue(myFerrari instanceof Car);
	}

	@Test
	public void testDefaultMethodsValue() {
		assertFalse(myFerrari.needsFuel());
	}

	@Test
	public void testStubAnswer() {
		when(myFerrari.needsFuel()).thenReturn(true);
		assertTrue(myFerrari.needsFuel());
	}

	@Test(expected = Exception.class)
	public void testCar_callMethod_shouldReturnException() {
		when(myFerrari.needsFuel()).thenThrow(new Exception());
		myFerrari.needsFuel();
	}

	@Test
	public void testVerifivation() {
		myFerrari.driveTo("Sweet home Alabama");
		myFerrari.needsFuel();
		verify(myFerrari).driveTo("Sweet home Alabama");
		verify(myFerrari).needsFuel();
	}

	@Test
	public void testVerificationFailureArguments() {
		myFerrari.driveTo("Sweet home Alabama");
		verify(myFerrari).driveTo("Sweet home Honolulu");
	}

}
