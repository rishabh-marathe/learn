/* Write program weather the number is PERFECT NUMBER or not?
Def: Perfect number, a	positive	integer	that	is	equal	to	the	sum	of	its	
proper	divisors.	The	smallest	perfect	number	is	6,	which	is	the	sum	
of	1,	2,	and	3.	*/

import java.util.Scanner;

public class perfect_Number {
	
	public	static	void	main(String[]	args)		
	 {	
	 	 Scanner	sc=new	Scanner(System.in);	
	 	 System.out.println("enter a number");	
	 	 int	n=sc.nextInt();	
	 	 for(int num=1;num<=n;num++)	
	 	 {	
	 	 int sum=1;	
	 	 for(int i=2;i<=num/2;i++)	
	 	 {	
	 	 	 if(num%i==0)	
	 	 	 sum=sum+i;	
	 	 }	
	 	 if	(sum==num)	
	 	 {	
	 	 	 System.out.println(num+" is a Perfect number");	
	 	 }	
	 	 }	
	 

//	public static void main(String[] args) {
//		int num, sum=0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter a Number :");
//		
//		num = sc.nextInt();
//		
//		for(int i=1 ; i<=num/2; i++ )
//		{
//		
//		if (num%i==0)
//		{
//			sum = sum + i;
//			
//		}
//		}
//		
//			if(num%sum==0)
//			{
//				System.out.println(sum);
//			}else
//			{
//				
//				System.out.println(num + " Not a Perfect number");
//				
//			}
//			
//		
//		
		

//		{
//			System.out.println(num + " is Perfect number");
//		}     
			
		sc.close();

	}

}
