package chapter3_unit_tests_without_collaborators.fixtures;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClientTest {
	//fixture - some configuration for initializing state of testing SUT's or DOC's 
	private Address addressA = new Address("Street A");
	private Address addressB = new Address("Street B");
	private final int noAddresses = 0;

	@Test
	public void afterCreationShouldHAveNoAddress() {
		Client client = new Client();
		
		assertEquals(noAddresses, client.getAddresses().size());
	}
	
	@Test
	public void shouldAllowToAddAddress() {
		Client client = new Client();
		client.addAddress(addressA);
		
		assertEquals(1, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
	}
	
	@Test
	public void shouldAllowToAddManyAddresses() {
		Client client = new Client();
		client.addAddress(addressA);
		client.addAddress(addressB);
		
		assertEquals(2, client.getAddresses().size());
		assertTrue(client.getAddresses().contains(addressA));
		assertTrue(client.getAddresses().contains(addressB));	
	}

}
