package Contact;

public class Contact {
	private String id;
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String address;
	
	public Contact(String id,String firstName, String lastName,String phoneNumber,String address) {
		if(id == null || id.length()>10) {
			throw new IllegalArgumentException("Invalid id");
		}
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		if(phoneNumber == null || phoneNumber.length()!=10) {
			throw new IllegalArgumentException("Invalid number");
		}
		if(address == null || address.length()>30) {
			throw new IllegalArgumentException("Invalid address");
		}
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	
	public String getId() {
		return id;
	}
	public String getfirstName() {
		return firstName;
	}
	public String getlastName() {
		return lastName;
	}
	public String getphoneNumber() {
		return phoneNumber;
	}
	public String getaddress() {
		return address;
	}
	
	
	public void setFirstName(String firstName) {
		if(firstName == null || firstName.length()>10) {
			throw new IllegalArgumentException("Invalid First Name");
		}
		this.firstName = firstName;
	}
	public void setlastName(String lastName) {
		if(lastName == null || lastName.length()>10) {
			throw new IllegalArgumentException("Invalid Last Name");
		}
		this.lastName = lastName;
	}
	public void setphoneNumber(String phoneNumber) {
		if(phoneNumber == null || phoneNumber.length()!=10) {
			throw new IllegalArgumentException("Invalid phone Number");
		}
		this.phoneNumber = phoneNumber;
	}
	public void setAddress(String address) {
		if(address == null || address.length()!=10) {
			throw new IllegalArgumentException("Invalid address");
		}
		this.address = address;
	}

}
