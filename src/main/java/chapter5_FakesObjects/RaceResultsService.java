package chapter5_FakesObjects;

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
		for(Client client : clients) {
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
}
