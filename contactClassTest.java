package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import contact.ContactClass;

class contactClassTest {
	
	@Test
	void testGetContact() {
		ContactClass contact = new ContactClass("John","Smith","1234567890","123 This Rd.","1111111111");
		
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 This Rd."));
		//assertTrue(contact.getId().equals("111111111"));

	}
	
	@Test
	void testSetContact() {
		ContactClass contact = new ContactClass("John","Smith","1234567890","123 This Rd.","1111111111");
		
		assertTrue(contact.getFirstName().equals("John"));
		assertTrue(contact.getLastName().equals("Smith"));
		assertTrue(contact.getPhone().equals("1234567890"));
		assertTrue(contact.getAddress().equals("123 This Rd."));
		//assertTrue(contact.getId().equals("111111111"));
	}

	@Test
	@DisplayName("First name needs Too Long")
	void testFirstNameTooLong(){			
			Assertions.assertThrows(IllegalArgumentException.class, () ->{
				new ContactClass("John+123456", "Smith", "1234567890", "123 This Rd.", "1111111111");
				});	
	}

	@Test
	@DisplayName("Last Name too long.")
	void testLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new ContactClass("John", "Smith+123456", "1234567890", "123 This Rd.", "1111111111");
			});	
}
	
	@Test
	@DisplayName("Phone Number exactly 10 characters")
	void testPhoneIsTenCharacters() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new ContactClass("John", "Smith", "1234567890++", "123 This Rd.", "1111111111");
			});	
}
	
	@Test
	@DisplayName("Address needs to be 30 charcters or less and NOT null")
	void testAddressTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new ContactClass("John", "Smith", "1234567890", "123 This Rd. + THIS ADDRRESS IS TOO LONG", "1111111111");
			});	
}
	@Test
	@DisplayName("ID needs to be 10 charcters or less")
	void testIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () ->{
			new ContactClass("John", "Smith", "1234567890", "123 This Rd.", "1111111111+123");
			});	
}
}
