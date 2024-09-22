package java_practice;

import java.util.Scanner;

public class Areaofcircle {
	
	final double pi=3.142;

	public static void main(String[] args) {
		Areaofcircle o=new Areaofcircle();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter value of r");
		  double r = sc.nextDouble();
		  double Areaofcircle=o.pi*r*r; // pi is non static
		  System.out.println("Area of circle is : " +Areaofcircle);

}
}