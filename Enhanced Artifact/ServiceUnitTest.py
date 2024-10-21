# -*- coding: utf-8 -*-
"""
File: ServiceUnitTests.py
Author: Paul Stephan
Version: 1.0
Date: Sep 22, 2024

Description:
This tests the 3 different service classes made for this project
"""
import unittest
from datetime import datetime, timedelta
from appointment_service import AppointmentService
from contact_service import ContactService
from task_service import TaskService
from appointment import Appointment
from contact import Contact
from task import Task

class TestAppointmentService(unittest.TestCase):
    def setUp(self):
        AppointmentService.clear_memory()
        self.tomorrow = datetime.now() + timedelta(days=1)
        AppointmentService.add_appointment("123", self.tomorrow, "Dentist appointment")

    def test_add_appointment(self):
        self.assertTrue("123" in AppointmentService.appointment_map)

    def test_update_appointment(self):
        new_date = datetime.now() + timedelta(days=5)
        AppointmentService.update_appointment("123", new_date, "Updated appointment")
        self.assertEqual(AppointmentService.appointment_map["123"].get_description(), "Updated appointment")

    def test_delete_appointment(self):
        AppointmentService.delete_appointment("123")
        self.assertFalse("123" in AppointmentService.appointment_map)

class TestContactService(unittest.TestCase):
    def setUp(self):
        ContactService.clear_memory()
        ContactService.add_contact("001", "John", "Doe", "1234567890", "123 Main St")

    def test_add_contact(self):
        self.assertTrue("001" in ContactService.contact_map)

    def test_set_contact_first_name(self):
        ContactService.set_contact_first_name("001", "Jane")
        self.assertEqual(ContactService.contact_map["001"].get_first_name(), "Jane")

    def test_delete_contact(self):
        ContactService.delete_contact("001")
        self.assertFalse("001" in ContactService.contact_map)

class TestTaskService(unittest.TestCase):
    def setUp(self):
        TaskService.clear_memory()
        TaskService.add_task("101", "Shopping", "Buy groceries")

    def test_add_task(self):
        self.assertTrue("101" in TaskService.task_map)

    def test_set_task_name(self):
        TaskService.set_task_name("101", "Updated Shopping")
        self.assertEqual(TaskService.task_map["101"].get_name(), "Updated Shopping")

    def test_delete_task(self):
        TaskService.delete_task("101")
        self.assertFalse("101" in TaskService.task_map)

if __name__ == "__main__":
    unittest.main()
