package com.library;

import java.util.Scanner;

public class App {
	Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {

	}
	
	public int getInt() {
		int i = 0;
		while(true) {
			try {
				String str = scan.next();
				if(str.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				}
				i = Integer.parseInt(str);
				break;
			} catch (Exception e) {
				System.out.println("오류가 발생하였습니다.");
			}
		}
		return i;
	}
	
	public String getString() {
		String res = "";

		while(true) {
			try {
				res = scan.next();
				if(res.equalsIgnoreCase("q")) {
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
				} 
				break;		
			} catch (Exception e) {
				System.out.println("오류가 발생했습니다.");
			}
		}
		return res;
		
	}
}
