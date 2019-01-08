package chapter5_FakesObjects.ex.ex2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RaceResultsService {
	private Client client;
	private Set<Client> clients = new HashSet<>();
	
	public void setClient(Client client) {
		this.client = client;
	}


	public void sendMessage(Message message) {
		List<Client> recipients = getRecipients(message.getType());
		for(Client client : recipients) {
			client.receiveMessage(message);
		}
	}


	public void addClient(Client client) {
		clients.add(client);
	}


	public Integer getClientsCount() {
		return clients.size();
	}


	public Set<Client> getClients() {
		return clients;
	}


	public void deleteClient(Client client2) {
		clients.remove(client2);
	}


	public void addClient(Client client2, MessageType horseRace) {
		client2.setSubscribe(horseRace);
		clients.add(client2);
	}
	
	private List<Client> getRecipients(MessageType messageType){
		List<Client> rClients = new ArrayList<>();
		for(Client client : clients) {
			if(client.isNotified(messageType)){
				rClients.add(client);
			}
		}
		return rClients;
	}
}
