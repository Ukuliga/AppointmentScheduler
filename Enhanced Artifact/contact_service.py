# -*- coding: utf-8 -*-
"""
File: ContactService.py
Author: Paul Stephan
Version: 1.0
Date: Sep 22, 2024

Description:
This class provides services for managing contacts. It allows adding, updating, and deleting contacts.
"""

from contact import Contact

class ContactService:
    # Dictionary to store contacts
    contact_map = {}

    # Method to add a new contact
    @staticmethod
    def add_contact(contact_id, first_name, last_name, number, address):
        # Create a new Contact object
        contact = Contact(contact_id, first_name, last_name, number, address)

        # Check if the contact ID already exists
        if contact_id in ContactService.contact_map:
            raise ValueError("ID already exists")

        # Add the contact to the dictionary
        ContactService.contact_map[contact_id] = contact

    # Method to delete a contact
    @staticmethod
    def delete_contact(contact_id):
        # Check if the contact ID exists
        if contact_id not in ContactService.contact_map:
            raise ValueError("ID doesn't exist")

        # Remove the contact from the dictionary
        del ContactService.contact_map[contact_id]

    # Method to set the first name of a contact
    @staticmethod
    def set_contact_first_name(contact_id, first_name):
        # Check if the contact ID exists
        if contact_id not in ContactService.contact_map:
            raise ValueError("ID doesn't exist")

        # Update the first name of the contact
        ContactService.contact_map[contact_id].set_first_name(first_name)

    # Method to set the last name of a contact
    @staticmethod
    def set_contact_last_name(contact_id, last_name):
        # Check if the contact ID exists
        if contact_id not in ContactService.contact_map:
            raise ValueError("ID doesn't exist")

        # Update the last name of the contact
        ContactService.contact_map[contact_id].set_last_name(last_name)

    # Method to set the phone number of a contact
    @staticmethod
    def set_contact_number(contact_id, phone_number):
        # Check if the contact ID exists
        if contact_id not in ContactService.contact_map:
            raise ValueError("ID doesn't exist")

        # Update the phone number of the contact
        ContactService.contact_map[contact_id].set_phone_number(phone_number)

    # Method to set the address of a contact
    @staticmethod
    def set_contact_address(contact_id, address):
        # Check if the contact ID exists
        if contact_id not in ContactService.contact_map:
            raise ValueError("ID doesn't exist")

        # Update the address of the contact
        ContactService.contact_map[contact_id].set_address(address)

    # Method to clear all contacts
    @staticmethod
    def clear_memory():
        ContactService.contact_map.clear()