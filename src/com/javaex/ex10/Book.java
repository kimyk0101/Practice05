package com.javaex.ex10;

public class Book {
    private int bookNo;
    private String title;
    private String author;
    private int stateCod;
    
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getStateCod() {
		return stateCod;
	}
	public void setStateCod(int stateCod) {
		this.stateCod = stateCod;
	}
	
	public Book(int bookNo, String title, String author, int stateCod) {
		super();
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCod = stateCod;
	}
    
    public static void rent() {}
    
    public static void print() {}
}
