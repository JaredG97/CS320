package test;
import main.Contact;
import main.ContactService;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContactServiceTest {

	@Test
	public void testAddContact() {
		//initializing service
		ContactService Service = new ContactService();
		
		//creating test variables
		Contact Jared = new Contact("1", "Jared", "Gonsalves", "6033215225", "51 Congress Street");
		Contact Oliver = new Contact("2", "Oliver", "Gonsalves", "6033215225", "51 Congress Street");
		Contact Vienna = new Contact("3", "Vienna", "Gonsalves", "6033215225", "51 Congress Street");
		
		//tests the add contact method
		assertTrue(Service.addContact(Jared));
		assertTrue(Service.addContact(Oliver));
		assertTrue(Service.addContact(Vienna));
	}
	
	@Test
	public void testDeleteContact() {
		//initializing service
		ContactService Service = new ContactService();
		
		//creating test variables
		Contact Jared = new Contact("1", "Jared", "Gonsalves", "6033215225", "51 Congress Street");
		Contact Oliver = new Contact("2", "Oliver", "Gonsalves", "6033215225", "51 Congress Street");
		Contact Vienna = new Contact("3", "Vienna", "Gonsalves", "6033215225", "51 Congress Street");
		
		//creating contacts
		Service.addContact(Jared);
		Service.addContact(Oliver);
		Service.addContact(Vienna);
		
		//deleting contacts
		assertEquals(true, Service.deleteContact("1"));
		assertEquals(false, Service.deleteContact("4"));
		assertEquals(true, Service.deleteContact("3"));
	}
	
	@Test
	public void testUpdateContact() {
		//initializing service
		ContactService Service = new ContactService();
		
		//creating test variables
		Contact Jared = new Contact("1", "Jared", "Gonsalves", "6033215225", "51 Congress Street");
		
		//creating contacts
		assertEquals(true, Service.addContact(Jared));
		
		assertEquals(true, Service.updateContact("1", "Janette", "Gonsalves", "6033215225", "51 Congress Street"));
	}	
}
