'''
File: Appointment.py
Author: Paul Stephan
Version: 1.0
Date: Sept 22, 2024

Description:
This class represents an appointment with an ID, date, and description.
'''

from datetime import datetime

class Appointment:
    # Constructor
    def __init__(self, appointment_id, date, description):
        # Validation for id, date, and description
        if not appointment_id or len(appointment_id) > 10:
            raise ValueError("Invalid ID")
        if date is None or date < datetime.now():
            raise ValueError("Invalid or past date")
        if not description or len(description) > 50:
            raise ValueError("Invalid description")

        # Initialize instance variables
        self.id = appointment_id
        self.date = date
        self.description = description

    # Getter method for ID
    def get_id(self):
        return self.id

    # Getter method for date
    def get_date(self):
        return self.date

    # Setter method for date
    def set_date(self, date):
        if date is None or date < datetime.now():
            raise ValueError("Invalid Date")
        self.date = date

    # Getter method for description
    def get_description(self):
        return self.description

    # Setter method for description
    def set_description(self, description):
        if not description or len(description) > 50:
            raise ValueError("Invalid Description")
        self.description = description
