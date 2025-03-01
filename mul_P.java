import java.util.Scanner;

public class mul_P {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number :");
		
		int num1 = sc.nextInt();
		for (int j =0; j<=num1;j++) 
			{
			for(int i=1; i<=10;i++) 
				{
				int mul = j * i;
				System.out.println(j + "*" + i + " = " + mul );
				}
			System.out.println("");
			}
				
		sc.close();
	}

}
