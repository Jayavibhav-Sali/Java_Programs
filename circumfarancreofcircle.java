package java_practice;

import java.util.Scanner;

public class circumfarancreofcircle {

	final static double pi=3.142;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter value of r");
		  double r =sc.nextDouble();
		  double circumfarancreofcircle=2*pi*r;
		  System.out.println("circumfarancreofcircle is : "+ circumfarancreofcircle);
	}

}
