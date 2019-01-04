package chapter3_unit_tests_without_collaborators.fixtures;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClientTest3 {
	private Address addressA = new Address("street A");
	private Address addressB = new Address("street B");
	private Client client;
	
	@Before
	public void setUp() {
		client = new Client();
		//this method will be called before every @Test
	}

	@Test
	public void afterCreationShouldHaveNoAddress() {
		assertEquals(0, client.getAddresses().size());
	}

	@Test
	public void shouldAllowToAddAddress() {
		client.addAddress(addressA);
		assertEquals(1, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
	}

	@Test
	public void shouldAllowToAddManyAddresses() {
		client.addAddress(addressA);
		client.addAddress(addressB);
		assertEquals(2, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
		assertTrue(client.getAddresses().contains(addressB));
	}
}
