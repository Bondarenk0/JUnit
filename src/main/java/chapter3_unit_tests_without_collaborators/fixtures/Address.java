package chapter3_unit_tests_without_collaborators.fixtures;

public class Address {
	private String address;
	
	public Address(String address) {
		super();
		this.address = address;
	}

	public void setAdress(String adress) {
		this.address = adress;
	}
	
	public String getAddress() {
		return address;
	}
}
