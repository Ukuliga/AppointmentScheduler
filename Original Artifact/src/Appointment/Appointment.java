package Appointment;

import java.util.Date;

public class Appointment {
	
	private String id;
	private Date date;
	private String description;
	
	public Appointment(String id,Date date,String description) {
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if(date == null || date.before(new Date())) {
			throw new IllegalArgumentException("Invalid Date");
		}
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		this.id = id;
		this.date = date;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public Date getDate() {
		return date;
	}
	public void setName(Date date) {
		if(date == null || date.before(new Date())) {
			throw new IllegalArgumentException("Invalid Date");
		}
		this.date = date;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String Description) {
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.description = Description;
	}
}
