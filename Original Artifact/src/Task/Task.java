package Task;

public class Task {
	
	private String id;
	private String name;
	private String description;
	
	public Task(String id,String name,String description) {
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if(name == null || name.length()>20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		if(description == null || description.length()>50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		
		this.id = id;
		this.name = name;
		this.description = description;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String Name) {
		if(name == null || name.length()>20) {
			throw new IllegalArgumentException("Invalid Name");
		}
		this.name = Name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String Description) {
		if(name == null || name.length()>50) {
			throw new IllegalArgumentException("Invalid Description");
		}
		this.description = Description;
	}
}
