# -*- coding: utf-8 -*-
"""
Created on Sun Sep 22 22:16:24 2024

@author: User
"""

from appointment import Appointment

class AppointmentService:
    # Dictionary to store appointments
    appointment_map = {}

    # Method to add a new appointment
    @staticmethod
    def add_appointment(appointment_id, date, description):
        # Check if the appointment ID already exists
        if appointment_id in AppointmentService.appointment_map:
            raise ValueError("ID already exists")

        # Create a new appointment object
        appointment = Appointment(appointment_id, date, description)

        # Add the appointment to the dictionary
        AppointmentService.appointment_map[appointment_id] = appointment

    # Method to update an existing appointment
    @staticmethod
    def update_appointment(appointment_id, date, description):
        # Check if the appointment ID exists
        if appointment_id not in AppointmentService.appointment_map:
            raise ValueError("ID doesn't exist")

        # Create a new appointment object
        appointment = Appointment(appointment_id, date, description)

        # Update the appointment in the dictionary
        AppointmentService.appointment_map[appointment_id] = appointment

    # Method to delete an appointment
    @staticmethod
    def delete_appointment(appointment_id):
        # Check if the appointment ID exists
        if appointment_id not in AppointmentService.appointment_map:
            raise ValueError("ID doesn't exist")

        # Remove the appointment from the dictionary
        del AppointmentService.appointment_map[appointment_id]

    # Method to clear all appointments from memory
    @staticmethod
    def clear_memory():
        AppointmentService.appointment_map.clear()