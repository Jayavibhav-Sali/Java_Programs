package sample;

public class staticmethod {

	static void name() {
		System.out.println("Static Method 1:"+ " Hi this is Jayavibav");

	}

	static void text() {
		System.out.println("Static Method 2:"+ " And This is My 1st Assignment");
	}

	static void add() {
		int a = 10;
		int b = 20;
		int sum = a + b;
		System.out.println("Static Method 3:"+ " Sum =" + sum);
	}

	static void sub() {
		float f1 = 23.6f;
		double d = 21.3;
		double dd = f1 - d;
		System.out.println("Static Method 4:"+ " Sub = " + dd);
	}

	static String Finaltext() {
		String str = "Static Method 5:"+ " Please check all the above methods";
		System.out.println(str);
		return str;

	}

	public static void main(String[] args) {
		
		staticmethod s1=new staticmethod();
		s1.name();
		s1.text();
		s1.add();
		s1.sub();
		s1.Finaltext();		

	}

}
