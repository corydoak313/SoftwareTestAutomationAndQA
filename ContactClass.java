package contact;

public class ContactClass {
	
	private String firstName;
	private String lastName;
	private String phone;
	private String address;
	private String id;
	
	public ContactClass(String firstName, String lastName, String phone, String address, String id){
		
		if(firstName == null || firstName.length() > 10) {
			throw new IllegalArgumentException("Invalid First Name Input");
		}
		if(lastName == null || lastName.length() > 10) {
			throw new IllegalArgumentException("Invalid Last Name Input");
		}
		if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid Phone input");
		}
		if(address == null || address.length() > 30) {
			throw new IllegalArgumentException("Invalid Address Input");
		}
		if(id == null || id.length() > 10) {
			throw new IllegalArgumentException("Invalid ID Input");
		}
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.address = address;
		this.id = id;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getLastName() {
		return lastName;
	}
	
	public String getId() {
		return id;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Name: " + firstName + lastName + ", ID: " + id + ", Phone: " + phone + ", Address: " + address;
	}
}
