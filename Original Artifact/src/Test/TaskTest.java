package Test;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Task.Task;

class TaskTest {
	
	@Test
	void testTaskClass() {
		Task task = new Task("1234", "first task", "Complete this before doing anything else.");
		assertTrue(task.getId().equals("1234"));
		assertTrue(task.getName().equals("first task"));
		assertTrue(task.getDescription().equals("Complete this before doing anything else."));
	}

	@Test
	void testIdTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345678901", "first task","Complete this before doing anything else.");
			});
	}
	
	@Test
	void testIdNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task(null, "first task","Complete this before doing anything else.");
			});
	}
	@Test
	void testNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "first task available for this assignment","Complete this before doing anything else.");
			});
	}
	
	@Test
	void testNameNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", null,"Complete this before doing anything else.");
			});
	}
	@Test
	void testDescriptionTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345678901", "first task","Complete this before doing anything else. It will be necessary in order to complete the next task in the series");
			});
	}
	
	@Test
	void testDesriptionNull() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new Task("12345", "first task",null);
			});
	}
	

}
