package com.javaex.minipro02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br= new BufferedReader(new FileReader("C:\\javaStudy\\file\\minipro\\PhoneDB.txt"));
		Option_output.makeList(br);
		
		Scanner sc= new Scanner(System.in);
		boolean action= true;

		Option_output.opening();
		
		while(action) {
			Option_output.menu();
			int order= sc.nextInt();
			
			switch(order) {
				case 1: 
					Option_output.showList();
					break;
	
				case 2:
					Option_input.enroll();
					Option_output.reWrite();
					break;
					
				case 3:
					Option_input.delete();
					Option_output.reWrite();
					break;
					
				case 4:
					Option_input.search();
					break;
					
				case 5: 
					Option_output.closing();
					action= false;
					break;
					
				default :
					Option_output.reenter();
					break;
			}
		}		
		sc.close();
	}
}
