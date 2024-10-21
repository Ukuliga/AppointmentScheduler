'''
File: Contact.py
Author: Paul Stephan
Version: 1.0
Date: Sept 22, 2024

Description:
This class represents a contact with details such as ID, first name, last name, phone number, and address.
'''

class Contact:
    # Constructor
    def __init__(self, contact_id, first_name, last_name, phone_number, address):
        # Validation for contact_id, first_name, last_name, phone_number, and address
        if not contact_id or len(contact_id) > 10:
            raise ValueError("Invalid ID")
        if not first_name or len(first_name) > 10:
            raise ValueError("Invalid First Name")
        if not last_name or len(last_name) > 10:
            raise ValueError("Invalid Last Name")
        if not phone_number or len(phone_number) != 10:
            raise ValueError("Invalid Phone Number")
        if not address or len(address) > 30:
            raise ValueError("Invalid Address")
        
        # Initialize instance variables
        self.id = contact_id
        self.first_name = first_name
        self.last_name = last_name
        self.phone_number = phone_number
        self.address = address

    # Getter methods
    def get_id(self):
        return self.id

    def get_first_name(self):
        return self.first_name

    def get_last_name(self):
        return self.last_name

    def get_phone_number(self):
        return self.phone_number

    def get_address(self):
        return self.address

    # Setter methods
    def set_first_name(self, first_name):
        if not first_name or len(first_name) > 10:
            raise ValueError("Invalid First Name")
        self.first_name = first_name

    def set_last_name(self, last_name):
        if not last_name or len(last_name) > 10:
            raise ValueError("Invalid Last Name")
        self.last_name = last_name

    def set_phone_number(self, phone_number):
        if not phone_number or len(phone_number) != 10:
            raise ValueError("Invalid Phone Number")
        self.phone_number = phone_number

    def set_address(self, address):
        if not address or len(address) > 30:
            raise ValueError("Invalid Address")
        self.address = address