package gaya3;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		
		double height = 0;
		double weight = 0;
		double pounds = 0;
		double inches = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in Pounds :");
		pounds = sc.nextDouble();
		
		System.out.println("Enter Height in Inches :");
		inches = sc.nextDouble();
		
		weight = pounds/0.45359237; //convert to kgms
		height = inches*0.0254; //convert to meters
		
		double bmi = weight /(height*height);
		
		if(bmi<18.5)
		{
			System.out.println("Underweight");
		}
		else if(bmi >= 18.5 && bmi < 25.0)
		{
			System.out.println("Normal");
		}
		else if(bmi >= 25.0 && bmi < 30.0)
		{
			System.out.println("Overweight");
		}
		else if(bmi >= 30.0)
		{
			System.out.println("Obese");
		}
		else
			System.out.println("");
		
		
		
	}

}
