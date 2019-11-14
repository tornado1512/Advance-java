package models;

public class Book{
	private Integer bookId;
	private String bookTitle;
	private String bookAuthor;
	private Integer bookPrice;

	public void setBookId(Integer bookId){
		this.bookId=bookId;
	}
	public Integer getBookId(){
		return bookId;
	}
	public void setBookTitle(String bookTitle){
		this.bookTitle=bookTitle;
	}
	public String getBookTitle(){
		return bookTitle;
	}
	public void setBookAuthor(String bookAuthor){
		this.bookAuthor=bookAuthor;
	}
	public String getBookAuthor(){
		return bookAuthor;
	}
	public void setBookPrice(Integer bookPrice){
		this.bookPrice=bookPrice;
	}
	public Integer getBookPrice(){
		return bookPrice;
	}
}