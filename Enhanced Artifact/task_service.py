# -*- coding: utf-8 -*-
"""
File: TaskService.py
Author: Paul Stephan
Version: 1.0
Date: Sep 22, 2024

Description:
This class provides services for managing tasks. It allows adding, updating, and deleting tasks.
"""

from task import Task

class TaskService:
    # Dictionary to store tasks with their IDs as keys
    task_map = {}

    # Method to add a new task to the task map
    @staticmethod
    def add_task(task_id, name, description):
        # Create a new task object
        task = Task(task_id, name, description)

        # Check if the task ID already exists in the map
        if task_id in TaskService.task_map:
            raise ValueError("ID already exists")

        # Add the task to the map
        TaskService.task_map[task_id] = task

    # Method to delete a task from the task map
    @staticmethod
    def delete_task(task_id):
        # Check if the task ID exists in the map
        if task_id not in TaskService.task_map:
            raise ValueError("ID doesn't exist")

        # Remove the task from the map
        del TaskService.task_map[task_id]

    # Method to update the name of a task
    @staticmethod
    def set_task_name(task_id, name):
        # Check if the task ID exists in the map
        if task_id not in TaskService.task_map:
            raise ValueError("ID doesn't exist")

        # Update the name of the task
        TaskService.task_map[task_id].set_name(name)

    # Method to update the description of a task
    @staticmethod
    def set_task_description(task_id, description):
        # Check if the task ID exists in the map
        if task_id not in TaskService.task_map:
            raise ValueError("ID doesn't exist")

        # Update the description of the task
        TaskService.task_map[task_id].set_description(description)

    # Method to clear the task map (empty it)
    @staticmethod
    def clear_memory():
        TaskService.task_map.clear()