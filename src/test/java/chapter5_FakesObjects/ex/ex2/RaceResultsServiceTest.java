package chapter5_FakesObjects.ex.ex2;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Test;

public class RaceResultsServiceTest {

	@Test
	public void sendMessage_sendMessageAboutHorseRace_shouldReceiveOnlyHorceReceivers() {
		Message message = mock(Message.class);
		when(message.getType()).thenReturn(MessageType.HORSE_RACE);

		
		Client client = mock(Client.class);
		RaceResultsService raceResultsService = new RaceResultsService();
		raceResultsService.addClient(client, message.getType());
		when(client.isNotified(MessageType.HORSE_RACE)).thenReturn(true);
		raceResultsService.sendMessage(message);
		verify(client).receiveMessage(any());
	}

}
