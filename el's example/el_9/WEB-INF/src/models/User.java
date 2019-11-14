package models;

public class User{
	private int age;
	private String name;
	private Address address;

	
	public void setAddress(Address address){
		this.address=address;
	}
	public Address getAddress(){
		return address;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
}