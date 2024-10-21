package Test;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Appointment.Appointment;
import Appointment.AppointmentService;

class AppointmentServiceTest {
	
	
	
	
	@Test
	void testaddAppointment() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2023-06-15");
		AppointmentService.addAppointment("54321", appointmentDate, "my first appointment" );
		assertTrue(true);
	}
	@Test
	void testaddAppointmentIdAlreadyExists() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2023-06-15");
		AppointmentService.addAppointment("12345", appointmentDate, "my first appointment" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			AppointmentService.addAppointment("12345", appointmentDate, "my first appointment" );
			});
	}
	@Test
	void testdeleteAppointment() throws ParseException {
		Date appointmentDate = new SimpleDateFormat("yyyy-MM-dd").parse("2023-06-15");
		AppointmentService.addAppointment("12345", appointmentDate, "my first appointment" );
		AppointmentService.deleteAppointment("12345");
		assertTrue(true);
	}
	@Test
	void testdeleteAppointmentdoesntExist() throws ParseException {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			AppointmentService.deleteAppointment("12345");
		});
	}
	

}
