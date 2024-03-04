package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import main.Contact;

class ContactTest {
	
	//testing both class functionality and setting parameters for testing below
	@Test
	void testContactClass() {
		Contact Contact = new Contact("1234567890", "Jared", "Gonsalves", 
				"6033215225", "51 Congress Street");
		assertTrue(Contact.getContactId().equals("1234567890"));
		assertTrue(Contact.getFirstName().equals("Jared"));
		assertTrue(Contact.getLastName().equals("Gonsalves"));
		assertTrue(Contact.getPhone().equals("6033215225"));
		assertTrue(Contact.getAddress().equals("51 Congress Street"));
	}
	
	
	/*
	this series of tests is testing the length and null case of each variable within the
	contact class itself, in order of ID, first name, last name,
	phone, and address. We use 'X' and null as a way to show this functionality.
	*/
	@Test
	void testContactIdLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890X", "Jared", "Gonsalves", 
					"6033215225", "51 Congress Street");
		});
	}
	
	
	@Test
	void testContactIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Jared", "Gonsalves", 
					"6033215225", "51 Congress Street");
		});
	}
	
	
	@Test
	void testContactFirstNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "JaredXXXXXX", "Gonsalves", 
					"6033215225", "51 Congress Street");
		});
	}
	

	@Test
	void testContactFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", null, "Gonsalves", 
					"6033215225", "51 Congress Street");
		});
	}
	
	@Test
	void testContactLastNameLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Jared", "GonsalvesXX", 
					"6033215225", "51 Congress Street");
		});
	}
	

	@Test
	void testContactLastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Jared", null, 
					"6033215225", "51 Congress Street");
		});
	}
	
	@Test
	void testContactPhoneLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Jared", "Gonsalves", 
					"6033215225X", "51 Congress Street");
		});
	}
	

	@Test
	void testContactPhoneNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Jared", "Gonsalves", 
					null, "51 Congress Street");
		});
	}
	
	@Test
	void testContactAddressLength() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Jared", "Gonsalves", 
					"6033215225", "51XXX CongressXX StreetXXXXXXXX");
		});
	}
	

	@Test
	void testContactAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234567890", "Jared", "Gonsalves", 
					"6033215225", null);
		});
	}
}