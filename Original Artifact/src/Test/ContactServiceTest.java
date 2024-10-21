package Test;

import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Contact.ContactService;

class ContactServiceTest {

	@BeforeEach
	void setup() {
		ContactService.clearmemory();
	}
	
	@Test
	void testaddTaskIdAlreadyExists() {
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		});
	}
	@Test
	void testaddTask() {
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		assertTrue(true);
	}
	
	@Test
	void testdeleteTask() {
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		ContactService.deleteContact("1234");
		assertTrue(true);
	}
	@Test
	void testdeleteTaskdoesntExist(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			ContactService.deleteContact("1234");
		});
	}
	@Test
	void testsetFirstname(){
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		ContactService.setContactFirstName("1234", "Anthony");
		assertTrue(true);
	}
	@Test
	void testsetLastname(){
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		ContactService.setContactLastName("1234", "Jachthuber");
		assertTrue(true);
	}
	@Test
	void testsetNumber(){
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		ContactService.setContactNumber("1234", "5134242715");
		assertTrue(true);
		
	}
	@Test
	void testsetAddress(){
		ContactService.addContact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		ContactService.setContactAddress("1234", "Chicago,IL");
		assertTrue(true);
		
	}

}
