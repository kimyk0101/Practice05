package com.javaex.ex10;

public class Book {
	public int bookNo;
    public String title;
    public String author;
    public int stateCode;
    
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
	public int getStateCode() {
		return stateCode;
	}
	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	

	public void rent() {
    	 stateCode = 0;
    	 System.out.println(title + "이(가) 대여 됐습니다.");
    }
    
    public void print() {
    	System.out.println(" 책 제목:" +  title + ", 작가:" + author + ", 대여유무:" + stateCode);
    }
}
