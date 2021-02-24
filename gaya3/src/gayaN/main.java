package gayaN;
import java.util.Scanner;

public class main {
	public static void main(String args[]) {
		
		int[] numberArr = new int[7]; //3 5 2 5 5 5 0
		int max = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numbers :");
		
		for(int i=0;i < numberArr.length;i++) {
			
			numberArr[i] = sc.nextInt();
			
			if(numberArr[i] > max) {
				max = numberArr[i];
			}
		}
		for(int j=0;j < numberArr.length;j++) {
			
			if(numberArr[j]==max) {
				count++;
			}
		}
		System.out.println("Largest Number is :"+max);
		System.out.println("Occurrence count of the largest number is :"+count);
		
		
	}

}
