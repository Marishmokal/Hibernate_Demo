package hibernate_demo;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	int pin;
	String city;
	Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
	
}
