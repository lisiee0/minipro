package com.javaex.minipro02;

import java.util.Scanner;

public class Option_input extends Person {
	
	public static void enroll() {	
		Scanner ent= new Scanner(System.in); // ent 스캐너를 여기서 닫으면 오류발생
		String name, hp, company;
		
		System.out.println("<2.등록>");
		System.out.print(">이름: ");
		name= ent.nextLine();
		System.out.print(">휴대전화: ");
		hp= ent.nextLine();
		System.out.print(">회사전화: ");
		company= ent.nextLine();
		System.out.println("[등록되었습니다.]");
		
		pList.add(new Person(name, hp, company));
	}
	
	public static void delete() {
		Scanner ent= new Scanner(System.in);
		
		System.out.println("<3.삭제>");
		System.out.print(">번호: ");
		int index= ent.nextInt();
		pList.remove(index-1);
		System.out.println("[삭제되었습니다.]");
	}
	
	public static void search() {
		Scanner ent= new Scanner(System.in);
		System.out.println("<4.검색>");
		System.out.print(">이름: ");
		String search= ent.nextLine();
		
		for(Person p: pList) {
			if(p.getName().contains(search)) {
				System.out.print(pList.indexOf(p)+1+".  ");
				p.showInfo();
			}
		}
	}
}
