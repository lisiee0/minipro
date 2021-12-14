package minipro02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Option_input {
	
	static List<Person> pList= new ArrayList<Person>();
	
	public static void makeList(BufferedReader br) throws IOException {		
		while(true) {
			String line= br.readLine();
			if(line==null) {
				break;
			}
			String[] info= line.split(",");
			pList.add(new Person(info[0], info[1], info[2]));	
		}
	}
	
	
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
	
	public static void reWrite() throws IOException {
		BufferedWriter bw= new BufferedWriter(new FileWriter("C:\\javaStudy\\file\\minipro\\PhoneDB.txt"));
		for(Person p: pList) {
			bw.write(p.save());
			bw.newLine();
		}
		bw.close();
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
