package models;

public class Student{
	private String name;
	private Integer age;

	public Student(String name,Integer age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setAge(Integer age){
		this.age=age;
	}
	public Integer getAge(){
		return age;
	}
}