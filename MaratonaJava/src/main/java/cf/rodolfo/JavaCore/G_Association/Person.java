package cf.rodolfo.JavaCore.G_Association;

import cf.rodolfo.JavaCore.H_Heritage.Address;

public class Person {
	protected String name;
	protected String cpf;
	protected Address address;
	static {
		System.out.printf("Inside of Person's STATIC inicialization block%n");
	}
	{
		System.out.printf("Inside of Person's inicialization block 1%n");
	}
	{
		System.out.printf("Inside of Person's inicialization block 2%n");
	}

	public Person(String name) {
		this.name = name;
		System.out.printf("Inside of Person's constructor%n");
	}

	public void printInfo() {
		System.out.printf("Name: %s%n", this.name);
		System.out.printf("CPF: %s%n", this.cpf);
		System.out.printf("Address: %s - CEP: %s%n", this.address.getStreet(), this.address.getCep());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
