package models;
import java.util.*;

public class Student
{
	private String name;
	private String college;
	 private int age;
	private String degree;

	public Student(){
	
	}
	public Student(String name,int age,String college,String degree ){
	this.name=name;
	this.age=age;
	this.college=college;
	this.degree=degree;
	}
	public static ArrayList<Student> collectStudents(){
		ArrayList<Student> students=new ArrayList<Student>();
		Student s1=new Student("Mohan",21,"GGCT","Btech");
		Student s2=new Student("Sohan",22,"GGCT","Mtech");
		Student s3=new Student("Rohan",25,"GGSC","BSC");
		Student s4=new Student("Zohan",24,"GGSC","MSC");
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		return students;
	}

	public void registerStudent(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(college);
		System.out.println(degree);
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setCollege(String college){
		this.college=college;
	}
	public String getCollege(){
		return college;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public void setDegree(String degree){
		this.degree=degree;
	}
	public String getDegree(){
		return degree;
	}


}