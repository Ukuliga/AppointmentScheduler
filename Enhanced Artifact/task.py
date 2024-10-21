# -*- coding: utf-8 -*-
"""

File: Task.py
Author: Paul Stephan
Version: 1.0
Date: Sep 22, 2024

Description:
This class represents a task with details such as ID, name, and description.

"""

class Task:
    # Constructor to initialize the task object with id, name, and description
    def __init__(self, task_id, name, description):
        # Validation checks for the input parameters
        if not task_id or len(task_id) > 10:
            raise ValueError("Invalid ID")
        if not name or len(name) > 20:
            raise ValueError("Invalid Name")
        if not description or len(description) > 50:
            raise ValueError("Invalid Description")

        # Assign values to attributes
        self.id = task_id
        self.name = name
        self.description = description

    # Getter method for retrieving the task ID
    def get_id(self):
        return self.id

    # Getter method for retrieving the task name
    def get_name(self):
        return self.name

    # Setter method for updating the task name
    def set_name(self, name):
        if not name or len(name) > 20:
            raise ValueError("Invalid Name")
        self.name = name

    # Getter method for retrieving the task description
    def get_description(self):
        return self.description

    # Setter method for updating the task description
    def set_description(self, description):
        if not description or len(description) > 50:
            raise ValueError("Invalid Description")
        self.description = description