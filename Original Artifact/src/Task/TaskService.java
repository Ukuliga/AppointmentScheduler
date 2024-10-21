package Task;
import java.util.HashMap;

import Task.Task;

public class TaskService {
	
	// Creating an empty HashMap
    private static HashMap<String, Task> task_map = new HashMap<String, Task>();
    
    public static void addTask(String id, String name, String description) {
    	Task task = new Task(id,name,description);
    	if(task_map.containsKey(id)) {
			throw new IllegalArgumentException("Id already exists");
		}
    	task_map.put(id, task);
		return;
    }
    public static void deleteTask(String id) {
    	if(!task_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exists");
		}
    	task_map.remove(id);
    	return;
    }
    public static void setTaskName(String id, String name) {
    	if(!task_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exists");
		}
    	task_map.get(id).setName(name);
    	return;
    }
    public static void setTaskDescription(String id, String description) {
    	if(!task_map.containsKey(id)) {
			throw new IllegalArgumentException("Id doesn't exists");
		}
    	task_map.get(id).setName(description);
    	return;
    }
    public static void clearmemory() {
    	task_map.clear();
    	return;
    }
			

}
