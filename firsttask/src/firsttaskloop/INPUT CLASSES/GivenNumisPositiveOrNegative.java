package firsttaskloop;

import java.util.Scanner;

public class GivenNumisPositiveOrNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scannerobject = new Scanner(System.in);
		System.out.println("enter the number");
		int num = scannerobject.nextInt();
		
		if(num<0)
		{
			System.out.println("neative number"); 
		}
		else
		{
			System.out.println("positive number"); 
		}

	}

}
