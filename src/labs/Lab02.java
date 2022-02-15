package labs;



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
		
		
		
	}

	
	

	public static void problem03() {

		
		
	}


	
	
	public static void problem04() {
		
		
		
		
	}
	
	

	
}
