package Test;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Task.TaskService;
import Task.Task;


class TaskServiceTest {
	
	@BeforeEach
	void setup() {
		TaskService.clearmemory();
	}
	
	@Test
	void testaddTaskIdAlreadyExists() {
		TaskService.addTask("54321" , "first Task", "my first thing i need to do" );
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			TaskService.addTask("54321" , "first Task", "my first thing i need to do" );
		});
	}
	@Test
	void testaddTask() {
		TaskService.addTask("54321", "first Task", "my first thing i need to do" );
		assertTrue(true);
	}
	
	@Test
	void testdeleteTask() {
		TaskService.addTask("54321", "first Task", "my first thing i need to do" );
		TaskService.deleteTask("54321");
		assertTrue(true);
	}
	@Test
	void testdeleteTaskdoesntExist(){
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			TaskService.deleteTask("12345");
		});
	}
	@Test
	void testsetTaskname(){
		TaskService.addTask("54321", "first Task", "my first thing i need to do" );
		TaskService.setTaskName("54321", "updated task");
		assertTrue(true);
	}
	@Test
	void testsetTaskdescription(){
		TaskService.addTask("54321", "first Task", "my first thing i need to do" );
		TaskService.setTaskDescription("54321", "this is an updated thing to do");
		assertTrue(true);
		
	}
	

}

