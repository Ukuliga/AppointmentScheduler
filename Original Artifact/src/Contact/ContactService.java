package Contact;

import java.util.HashMap;

import Contact.Contact;

public class ContactService {
	// Creating an empty HashMap
    private static HashMap<String, Contact> contact_map = new HashMap<String, Contact>();
    
    public static void addContact(String id, String firstName, String lastName, String number, String address) {
    	Contact contact = new Contact(id,firstName,lastName,number,address);
    	if(contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id already exists");
		}
    	contact_map.put(id, contact);
		return;
    }
    public static void deleteContact(String id) {
    	if(!contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exists");
		}
    	contact_map.remove(id);
    	return;
    }
    public static void setContactFirstName(String id, String name) {
    	if(!contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exists");
		}
    	contact_map.get(id).setFirstName(name);
    	return;
    }
    public static void setContactLastName(String id, String name) {
    	if(!contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exists");
		}
    	contact_map.get(id).setlastName(name);
    	return;
    }
    public static void setContactNumber(String id, String number) {
    	if(!contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exists");
		}
    	contact_map.get(id).setphoneNumber(number);
    	return;
    }
    public static void setContactAddress(String id, String address) {
    	if(!contact_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exists");
		}
    	contact_map.get(id).setphoneNumber(address);
    	return;
    }
    public static void clearmemory() {
    	contact_map.clear();
    	return;
    }
			

}
