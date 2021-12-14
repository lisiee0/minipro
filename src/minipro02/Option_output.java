package minipro02;

import java.util.ArrayList;

public class Option_output {
	
	public static void opening() {
		System.out.println("*********************************");
		System.out.println("*        전화번호 관리 프로그램        *");
		System.out.println("*********************************");		
	}
	
	public static void menu() {
		System.out.println("");
		System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
		System.out.println("---------------------------------");
		System.out.print(">메뉴번호: ");
	}
	
	public static void closing() {
		System.out.println("");
		System.out.println("*********************************");
		System.out.println("*            감사합니다            *");
		System.out.println("*********************************");
	}
	
	public static void reenter() {
		System.out.println("[다시 입력해 주세요.]");
	}
	
	public static void showList(ArrayList pList) {
		System.out.println("<1.리스트>");
		for(Person p: pList) {
			System.out.print(pList.indexOf(p)+1+".  ");
			p.showInfo();
		}
	}
}
