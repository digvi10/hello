package com.banktrans;

public class UserDetails {
	String name;
	String gender;
	String bank;
	String age;
	String cardno;
	String creditlimit;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(String creditlimit) {
		this.creditlimit = creditlimit;
	}

	public UserDetails(String name, String age, String gender, String bank, String cardno, String creditlimit) {
		super();
		this.name = name;
		this.gender = gender;
		this.bank = bank;
		this.age = age;
		this.cardno = cardno;
		this.creditlimit = creditlimit;
		
	}
	@Override
	public String toString() {
		return "\nUserDetails [name=" + name + ", gender=" + gender + ", bank=" + bank + ", age=" + age + ", cardno="
				+ cardno + ", creditlimit=" + creditlimit + "]\n";
	}

}
