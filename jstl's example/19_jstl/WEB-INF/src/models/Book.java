package models;

public class Book{
	private String bookName;
	private Integer bookId;
	private String author;
	private String title;
	public Book(String bookName, Integer bookId, String author, String title){
		this.bookName=bookName;
		this.bookId=bookId;
		this.author=author;
		this.title=title;
	}
	public void setBookName(String bookName){
		this.bookName=bookName;
	}
	public String getBookName(){
		return bookName;
	}
	public void setBookId(Integer bookId){
		this.bookId=bookId;
	}
	public Integer getBookId(){
		return bookId;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public String getAuthor(){
		return author;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public String getTitle(){
		return title;
	}
}