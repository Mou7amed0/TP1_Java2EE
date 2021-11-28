package metier;

import java.util.Date;

public class User {
	private String firstName;
	private String lastName;
	private String email;
	private String mobile;
	private String dateOfBirth;
	private String username;
	private String password;
	
	// constructor
	public User(String firstName, String lastName, String dateOfBirth,String email, String mobile,  String username,
			String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.mobile = mobile;
		this.dateOfBirth = dateOfBirth;
		this.username = username;
		this.password = password;
	}
	
	// gatters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String unername) {
		this.username = unername;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
