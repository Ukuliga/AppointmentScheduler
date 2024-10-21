package Test;

import static org.junit.Assert.assertTrue;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Contact.Contact;

class ContactTest {

	@Test
	void testContactClass() {
		Contact task = new Contact("1234", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
		assertTrue(task.getId().equals("1234"));
		assertTrue(task.getfirstName().equals("Paul"));
		assertTrue(task.getlastName().equals("Stephan"));
		assertTrue(task.getphoneNumber().equals("5134352820"));
		assertTrue(task.getaddress().equals("Cincinnati,OH"));
	}

	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("12345678901", "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
			});
	}
	
	@Test
	void testIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact(null, "Paul", "Stephan", "5134352820" , "Cincinnati,OH");
			});
	}
	@Test
	void testFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul Anthony Stephan", "Stephan", "5134352820" , "Cincinnati,OH");
			});
	}
	
	@Test
	void testFirstNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", null, "Stephan", "5134352820" , "Cincinnati,OH");
			});
	}
	@Test
	void testlastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", "Paul Anthony Stephan", "5134352820" , "Cincinnati,OH");
			});
	}
	
	@Test
	void testlastNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", null, "5134352820" , "Cincinnati,OH");
			});
	}
	@Test
	void testNumberNotTen() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", "Stephan", "513-435-2820" , "Cincinnati,OH");
			});
	}
	
	@Test
	void testNumberNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", "Stephan", null , "Cincinnati,OH");
			});
	}
	@Test
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", "Stephan", "5134352820" , "1323 Avon Drive,Cincinnati,OH,USA,North America, Earth.");
			});
	}
	
	@Test
	void testAddressNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Contact("1234", "Paul", "Stephan", "5134352820" ,null);
			});
	}

}
