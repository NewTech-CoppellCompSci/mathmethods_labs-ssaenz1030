package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in); 
		double entnum;
		double entnum2;
		System.out.println("Put in an positive integer: ");
		entnum = inKey.nextInt();
		System.out.println("Put in another positive integer: ");
		entnum2 = inKey.nextInt();
		for(int  i = 1;i < 11; i++) {
			double scope = entnum;
			double min = entnum2;
			int num = (int) (Math.random() * scope +  min);
			System.out.print(num);
		}
	}
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		double Radius;
		double Height;
		double PI;
		PI = 3.14159265389793;
		System.out.println("Enter the radius: ");
		Radius = inKey.nextInt();
		System.out.println("Enter the height: ");
		Height = inKey.nextInt();
		
		System.out.println("The radiys is " + PI  * Radius * Radius * Height);
	}

	
	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		double x1;
		double y1;
		double x2;
		double y2;
		System.out.println("Enter x1: ");
		x1 = inKey.nextInt();
		System.out.println("Enter y1: ");
		y1 = inKey.nextInt();
		System.out.println("Enter x2: ");
		x2 = inKey.nextInt();
		System.out.println("Enter y2: ");
		y2 = inKey.nextInt();
		System.out.println("The distance between points");
		System.out.println( (x2 -  x1) * 2 + (y2 - y1 ) *2 );
	}
	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		double avalue;
		double bvalue;
		double cvalue;
		double x1;
		double x2;
		System.out.println("Enter a-value: ");
		avalue = inKey.nextInt();
		System.out.println("Enter b-value: ");
		bvalue = inKey.nextInt();
		System.out.println("Enter c-value: ");
		cvalue = inKey.nextInt();
		System.out.print("x1 = " + bvalue + "\n x2=" + (bvalue * 2 - 4 * avalue * cvalue));
	}
	
	

	
}
