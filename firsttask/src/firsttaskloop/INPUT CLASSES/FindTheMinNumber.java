package firsttaskloop;

import java.util.Scanner;

public class FindTheMinNumber {
	
	public static void main(String[] args) {
		int num1,num2,num3,minNum,tempNum;
		
		Scanner scannerObject = new Scanner(System.in);
		// TODO Auto-generated method stub
		
		System.out.println("Enter the first number:");  
		num1 = scannerObject.nextInt();  
		System.out.println("Enter the second number:");  
		num2 = scannerObject.nextInt();  
		System.out.println("Enter the third number:");  
		num3 = scannerObject.nextInt();  
		
		tempNum =num1<num2?num1:num2;
		minNum = num3<tempNum?num3:tempNum;
		
		System.out.println("The smallest number is: "+minNum);  
	
		
	}
}
