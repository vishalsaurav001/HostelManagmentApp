package com.hostel.vishal003;

public class Student {
    private int personId;
    private String personName;
    private String personPhone;
    private String personAddress;
    
    
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getPersonPhone() {
		return personPhone;
	}
	public void setPersonPhone(String personPhone) {
		this.personPhone = personPhone;
	}
	public String getPersonAddress() {
		return personAddress;
	}
	public void setPersonAddress(String personAddress) {
		this.personAddress = personAddress;
	}
	public Student(int personId, String personName, String personPhone, String personAddress) {
		super();
		this.personId = personId;
		this.personName = personName;
		this.personPhone = personPhone;
		this.personAddress = personAddress;
	}
	public Student(String personName, String personPhone, String personAddress) {
		super();
		this.personName = personName;
		this.personPhone = personPhone;
		this.personAddress = personAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [personId=" + personId + ", personName=" + personName + ", personPhone=" + personPhone
				+ ", personAddress=" + personAddress + "]";
	}
	
	
}
