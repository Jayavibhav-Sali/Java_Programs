package java_practice;

import java.util.Scanner;

public class arcofcircle {
	
	void area_1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter 1st a");
		int a1=sc.nextInt();

		System.out.println("Please enter 2nd a");
		int a2=sc.nextInt();
		int arc=a1*a2;
		System.out.println("arc is : "+ arc);
	}
		

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);

		arcofcircle ac= new arcofcircle();
		ac.area_1();
		
	}

}
