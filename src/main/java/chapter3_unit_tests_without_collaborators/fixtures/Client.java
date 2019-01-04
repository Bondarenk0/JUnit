package chapter3_unit_tests_without_collaborators.fixtures;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private List<Address> adresses = new ArrayList<>();
	
	public void addAddress(Address address) {
		adresses.add(address);
	}

	public List<Address> getAddresses() {
		return adresses;
	}

	public void setAdresses(List<Address> adresses) {
		this.adresses = adresses;
	}
	
	
}
