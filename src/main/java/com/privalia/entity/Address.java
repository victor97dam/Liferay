package com.privalia.entity;

public class Address {

	private int idAddress;
	private String street;
	
	public Address(){
	
	}
	
	public Address(int idAddress, String street) {
		super();
		this.idAddress = idAddress;
		this.street = street;
	}

	public int getIdAddress() {
		return idAddress;
	}

	public void setIdAddress(int idAddress) {
		this.idAddress = idAddress;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [idAddress=" + idAddress + ", street=" + street + "]";
	}
	
	
}


