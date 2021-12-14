package com.javaex.minipro02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String name;
	private String hp;
	private String company;
	
	public Person() {
		
	}
	
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	public String getName() {
		return name;
	}
	
	static List<Person> pList= new ArrayList<Person>();
	
	static BufferedReader input= new BufferedReader(new InputStreamReader(System.in));

	public void showInfo() {
		System.out.println(name+"  "+hp+"  "+company);
	}
	
	public String save() {
		return name+","+hp+","+company;
	}	
}
