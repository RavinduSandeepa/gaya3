package gaya3;
import java.util.Scanner;

public class Main1 {
	public static void main(String args[]) {
		
		int no1,no2,no3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no 1 :");
		no1 = sc.nextInt();
		System.out.println("Enter no 2 :");
		no2 = sc.nextInt();
		System.out.println("Enter no 3 :");
		no3 = sc.nextInt();
		
		if(no1==no2 && no2==no3)
		{
			System.out.println("all the same");
		}
		else if(no1!=no2 && no2!=no3)
		{
			System.out.println("all different");
			
			if(no1<no2 && no2<no3)
			{
				System.out.println("Inceasing "+no1+","+no2+","+no3);
			}
			else if(no1>no2 && no2>no3)
			{
				System.out.println("Decreasing "+no1+","+no2+","+no3);
			}
			else
			{
				System.out.println("Neither");
			}
		}
		else
		{
			System.out.println("neither");
		}
		
	}

}
