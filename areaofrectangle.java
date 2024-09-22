package java_practice;

import java.util.Scanner;

public class areaofrectangle {
	
	int length() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter length");
		int l=sc.nextInt();
		return l;
	}
	
	int breadth() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter breadth");
		int b=sc.nextInt();
		return b;
	}
		
	public static void main(String[] args) {
		areaofrectangle ar= new areaofrectangle();
		int tt=ar.length();
		int bb=ar.breadth();
		int rr=tt*bb;
		System.out.println("areaofrectangle is : "+rr);

	}

}
