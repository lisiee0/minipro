package com.javaex.minipro02;

import java.io.IOException;

public class Option_input extends Person {
	
	public static void enroll() throws IOException {	
		System.out.println("<2.등록>");
		System.out.print(">이름: ");
		String name= input.readLine();
		System.out.print(">휴대전화: ");
		String hp= input.readLine();
		System.out.print(">회사전화: ");
		String company= input.readLine();
		System.out.println("[등록되었습니다.]");
		
		pList.add(new Person(name, hp, company));	
	}
	
	public static void delete() throws IOException {		
		System.out.println("<3.삭제>");
		System.out.print(">번호: ");
		int index=  Integer.parseInt(input.readLine());
		pList.remove(index-1);
		System.out.println("[삭제되었습니다.]");		
	}
	
	public static void search() throws IOException {
		System.out.println("<4.검색>");
		System.out.print(">이름: ");
		String search= input.readLine();
		
		for(Person p: pList) {
			if(p.getName().contains(search)) {
				System.out.print(pList.indexOf(p)+1+".  ");
				p.showInfo();
			}
		}	
	}
}
