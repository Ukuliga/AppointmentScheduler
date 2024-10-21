package Test;

import static org.junit.Assert.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Appointment.Appointment;


class AppointmentTest {
	
	//DateUtils.parseDate(dateInString, "yyyy-MM-dd");
	@Test
	void testTaskClass() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2023-06-15");
		Appointment appointment = new Appointment("1234", appointmentDate, "Complete this before doing anything else.");
		assertTrue(appointment.getId().equals("1234"));
		assertTrue(appointment.getDate().equals(appointmentDate));
		assertTrue(appointment.getDescription().equals("Complete this before doing anything else."));
	}

	@Test
	void testIdTooLong() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2023-06-15");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901",  appointmentDate, "Complete this before doing anything else.");
			});
	}
	
	@Test
	void testIdNull() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2023-06-15");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment(null,  appointmentDate, "Complete this before doing anything else.");
			});
	}
	@Test
	void testDateTooEarly() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2021-06-15");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", appointmentDate,"Complete this before doing anything else.");
			});
	}
	
	@Test
	void testDateNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", null,"Complete this before doing anything else.");
			});
	}
	@Test
	void testDescriptionTooLong() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2023-06-15");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345678901", appointmentDate,"Complete this before doing anything else. It will be necessary in order to complete the next task in the series");
			});
	}
	
	@Test
	void testDesriptionNull() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2023-06-15");
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Appointment("12345", appointmentDate,null);
			});
	}
	

}

