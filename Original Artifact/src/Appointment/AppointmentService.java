package Appointment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import  java.util.HashMap;
import Appointment.Appointment;

public class AppointmentService {
	// Creating an empty HashMap
    private static HashMap<String, Appointment> appointment_map = new HashMap<String, Appointment>();
    public static void addAppointment(String id, Date date, String description) {
    	Appointment appointment = new Appointment(id,date,description);
    	if(appointment_map.containsKey(id)) {
			throw new IllegalArgumentException("Id already exists");
		}
		appointment_map.put(id, appointment);
		return;
    }
    public static void deleteAppointment(String id) {
    	if(!appointment_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exists");
		}
		appointment_map.remove(id);
    	return;
    }
			
}



