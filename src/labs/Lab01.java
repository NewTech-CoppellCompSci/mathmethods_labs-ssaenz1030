package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		problem02();
		problem03();
		problem04();
		
	}
	

	
	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in); //activating the scanner
		int entnum;
		System.out.println("Put in an positive integer: ");
		entnum = inKey.nextInt();
		int entnum1;
		System.out.println("Enter another in an positive integer: ");
		entnum1 = inKey.nextInt();
		
		double num1Pow = Math.pow(entnum, entnum1);
		System.out.println(num1Pow + "\n");
		
	}
		
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		int entnum;
		System.out.println("Put in an positive integer: ");
		entnum = inKey.nextInt();
		double num2 = Math.sqrt(entnum);
		System.out.println(num2 + "\n");
		
	}


	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		double entA, entB, hypotenuse;
		System.out.println("Length of side A");
		entA = inKey.nextInt();
		System.out.println("Length of side B");
		entB = inKey.nextInt();
		hypotenuse = Math.sqrt((entA*entA)+(entB*entB));
		System.out.println("Hypotenuse = " + hypotenuse);

	}

	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		int entnum;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		System.out.print("Enter an integer: ");
		entnum = inKey.nextInt();
		while (entnum > 0)  {
			System.out.print("Enter an integer: ");
			entnum = inKey.nextInt();
			if (entnum < 0)  {
				System.out.print("Enter an integer: ");
				entnum = inKey.nextInt();
				max = Math.max (max, entnum);
				System.out.println(max);
				System.out.println("Max = " + max);
				min = Math.min (min, entnum);
				System.out.println(min);
				System.out.println("Min = " + min);
			}
		}		
	}
	
	
	
	
	
	
}