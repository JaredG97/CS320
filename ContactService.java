package main;

import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contactMap = new HashMap<>();
    
    //adds a contact to the map
    public boolean addContact(Contact contact) {
    	if (!contactMap.containsKey(contact.getContactId())) {
    			contactMap.put(contact.getContactId(), contact);
    		return true;
    	}
    return false;
}

    //deletes a contact from the map
    public boolean deleteContact(String contactId) {
    	return contactMap.remove(contactId) != null;
    }

    //validation for fields
    private boolean isValidUpdate(String firstName, String lastName, String phone, String address) {
    	return !(firstName == null || firstName.length() > 10 ||
    			lastName == null || lastName.length() > 10 ||
    			phone == null || phone.length() != 10 ||
    			address == null || address.length() > 30);
    }
    
    //searches for a given ID in the map and updates each field accordingly
    public boolean updateContact(String contactID, String firstName, String lastName, String phone, String address) {
    	if (contactMap.containsKey(contactID)) {
    		if (isValidUpdate(firstName, lastName, phone, address)) {
    			Contact contact = contactMap.get(contactID);
    			contact.setFirstName(firstName);
    			contact.setLastName(lastName);
    			contact.setPhone(phone);
    			contact.setAddress(address);
    			return true;
    		}
    	}
    return false;
    }
}