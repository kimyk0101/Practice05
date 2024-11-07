package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		Member member1 = new Member();
		member1.setId("jws");
		member1.setName("정우성");
		member1.setPoint(50000);
		member1.showInfo();
		
		Member member2 = new Member();
		member2.setId("yjs");
		member2.setName("유재석");
		member2.setPoint(30000);
		member2.showInfo();
		
		Member member3 = new Member();
		member3.setId("lhr");
		member3.setName("이효리");
		member3.setPoint(40000);
		member3.showInfo();
		
	}

}
