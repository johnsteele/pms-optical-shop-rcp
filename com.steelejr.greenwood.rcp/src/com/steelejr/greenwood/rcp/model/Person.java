package com.steelejr.greenwood.rcp.model;

public abstract class Person {
	
	/** A person's gender. */
	public static enum Gender { MALE, FEMALE };
	
	/** Person's last name. */
	private String fLastName;
	
	/** Person's first name. */
	private String fFirstName;
	
	/** Person's gender. */
	private Gender fGender;
	
	/** Person's date of birth. */
	private String fDob;
	
	/** Person's website information. */
	private WebInfo fWebInfo;
	
	/** Person's eye care information. */
	private EyeCareInfo fEyeCareInfo;
	
	/** Person's contact information. */
	private ContactInfo fContactInfo;

	/**
	 * Returns the person's last name.
	 * 
	 * @return This person's last name.
	 */
	public String getLastName() {
		return fLastName;
	}

	/**
	 * Sets this person's last name.
	 * 
	 * @param lastName The new last name.
	 */
	public void setLastName(String lastName) {
		this.fLastName = lastName;
	}

	/**
	 * Returns this person's first name.
	 * 
	 * @return This person's first name.
	 */
	public String getFirstName() {
		return fFirstName;
	}

	/**
	 * Sets this person's first name. 
	 * 
	 * @param firstName The new first name.
	 */
	public void setFirstName(String firstName) {
		this.fFirstName = firstName;
	}
	
	/**
	 * Returns the gender of this person.
	 * 
	 * @return This person's gender.
	 */
	public Gender getGender () {
		return fGender;
	}
	
	/**
	 * Sets this person's gender.
	 * 
	 * @param gender The gender.
	 */
	public void setGender (Gender gender) {
		this.fGender = gender;
	}
	
	/**
	 * Returns this person's date of birth.
	 * 
	 * @return This person's date of birth.
	 */
	public String getDOB () {
		return fDob;
	}
	
	/**
	 * Sets this person's date of birth.s
	 * 
	 * @param dob The date of birth.
	 */
	public void setDOB (String dob) {
		this.fDob = dob;
	}
	
	/**
	 * Returns this person's website info.
	 * 
	 * @return This person's website info.
	 */
	public WebInfo getWebInfo () {
		return fWebInfo;
	}
	
	/**
	 * Sets this person's web info.
	 * 
	 * @param email The person's WebInfo.
	 */
	public void setWebInfo (WebInfo info) {
		this.fWebInfo = info;
	}
	
	/**
	 * Returns this person's eye care information.
	 * 
	 * @return This person's eye care info.
	 */
	public EyeCareInfo getEyeCareInfo() {
		return fEyeCareInfo;
	}

	/**
	 * Sets this person's eye care information.
	 * 
	 * @param eyeCareInfo The eye care info.
	 */
	public void setfEyeCareInfo(EyeCareInfo eyeCareInfo) {
		this.fEyeCareInfo = eyeCareInfo;
	}
	
	/**
	 * Returns this person's contact information.
	 * 
	 * @return This person's contact information.
	 */
	public ContactInfo getContactInfo() {
		return fContactInfo;
	}

	/**
	 * Sets this person's contact information.
	 * 
	 * @param contactInfo The new contact info.
	 */
	public void setfContactInfo(ContactInfo contactInfo) {
		this.fContactInfo = contactInfo;
	}
	
	
	/**
	 * A person's website information.
	 */
	public class WebInfo {
		private String email = "";
		private String username = "";
		private String password = "";
		
		public WebInfo () {}
		
		public WebInfo (String email, String user, String pass) {
			this.email = email;
			this.username = user;
			this.password = pass;
		}
		
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
	}
}
