# -*- coding: utf-8 -*-
"""
File: ClassUnitTests.py
Author: Paul Stephan
Version: 1.0
Date: Sep 22, 2024

Description:
This tests the 3 different classes made for this project 
"""

import unittest
from datetime import datetime, timedelta
from appointment import Appointment
from contact import Contact
from task import Task

class TestAppointment(unittest.TestCase):
    def setUp(self):
        # Create an appointment for testing, date set to tomorrow
        self.tomorrow = datetime.now() + timedelta(days=1)
        self.appointment = Appointment("123", self.tomorrow, "Doctor's visit")

    def test_valid_appointment(self):
        self.assertEqual(self.appointment.get_id(), "123")
        self.assertEqual(self.appointment.get_date(), self.tomorrow)
        self.assertEqual(self.appointment.get_description(), "Doctor's visit")

    def test_invalid_appointment_past_date(self):
        yesterday = datetime.now() - timedelta(days=1)
        with self.assertRaises(ValueError):
            Appointment("456", yesterday, "Expired appointment")

    def test_invalid_appointment_description_length(self):
        with self.assertRaises(ValueError):
            Appointment("123", self.tomorrow, "A" * 51)  # Description too long

class TestContact(unittest.TestCase):
    def setUp(self):
        self.contact = Contact("001", "John", "Doe", "1234567890", "123 Main St")

    def test_valid_contact(self):
        self.assertEqual(self.contact.get_id(), "001")
        self.assertEqual(self.contact.get_first_name(), "John")
        self.assertEqual(self.contact.get_last_name(), "Doe")
        self.assertEqual(self.contact.get_phone_number(), "1234567890")
        self.assertEqual(self.contact.get_address(), "123 Main St")

    def test_invalid_contact_phone(self):
        with self.assertRaises(ValueError):
            Contact("002", "Jane", "Doe", "12345", "456 Elm St")  # Invalid phone

class TestTask(unittest.TestCase):
    def setUp(self):
        self.task = Task("101", "Shopping", "Buy groceries")

    def test_valid_task(self):
        self.assertEqual(self.task.get_id(), "101")
        self.assertEqual(self.task.get_name(), "Shopping")
        self.assertEqual(self.task.get_description(), "Buy groceries")

    def test_invalid_task_description_length(self):
        with self.assertRaises(ValueError):
            Task("102", "Cleaning", "A" * 51)  # Description too long
