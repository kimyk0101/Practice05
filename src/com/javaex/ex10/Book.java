package com.javaex.ex10;

public class Book {
	public static int bookNo;
    public static String title;
    public static String author;
    public static int stateCode;
    
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
	
	public Book(int stateCode) {
		stateCode = 1;
	}
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Book [BookNo=" + getBookNo() + ", Title=" + getTitle() + ", Author=" + getAuthor()
				+ ", StateCode=" + getStateCode() + "]";
	}
	public static void rent() {
    	 stateCode = 0;
    	 System.out.println(title + "이(가) 대여 됐습니다.");
    }
    
    public static void print() {
    	if (stateCode == 1) {
    		System.out.println("재고있음");
    	} else if(stateCode == 0) {
    		System.out.println("대여중");
    	}
    }
}
