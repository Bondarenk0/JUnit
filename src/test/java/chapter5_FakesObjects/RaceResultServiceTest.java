package chapter5_FakesObjects;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class RaceResultServiceTest {

	@Test
	public void subscribedClientShouldReceiveMessage() {
		RaceResultsService raceResults = new RaceResultsService();
		Client client = mock(Client.class);
		raceResults.addClient(client);
		Message message = mock(Message.class);
		raceResults.sendMessage(message);
		verify(client).receiveMessage(message);
	}
	
	@Test
	public void addClient_putTwoClientsIntoService_shouldContainBoth() {
		Client client = mock(Client.class);
		Client client2 = mock(Client.class);
		RaceResultsService raceResultsService = new RaceResultsService();
		raceResultsService.addClient(client);
		raceResultsService.addClient(client2);
		assertTrue(2 == raceResultsService.getClientsCount());
	}
	
	@Test
	public void sendMessage_sendMessageToBothClients_shouldReceiveIt() {
		Client client = mock(Client.class);
		Client client2 = mock(Client.class);
		RaceResultsService raceResultsService = new RaceResultsService();
		raceResultsService.addClient(client);
		raceResultsService.addClient(client2);
		Message message = mock(Message.class);
		raceResultsService.sendMessage(message);
		for(Client cl: raceResultsService.getClients()) {
			verify(cl).receiveMessage(message);
		}
	}
	
	@Test
	public void addClient_addTheSameClient_shouldContainOnlyOne() {
		Client client = mock(Client.class);
		RaceResultsService raceResultsService = new RaceResultsService();
		raceResultsService.addClient(client);
		raceResultsService.addClient(client);
		assertTrue(1 == raceResultsService.getClientsCount());
	}
	
	@Test
	public void addClient_addTwoClientsAndDeleteOne_deletedShouldNotReceiveMessage() {
		Client client = mock(Client.class);
		Client client2 = mock(Client.class);
		RaceResultsService raceResultsService = new RaceResultsService();
		raceResultsService.addClient(client);
		raceResultsService.addClient(client2);
		raceResultsService.deleteClient(client2);
		Message message = mock(Message.class);
		raceResultsService.sendMessage(message);
		verify(client).receiveMessage(message);
		verify(client2, never()).receiveMessage(message);
	}

}
