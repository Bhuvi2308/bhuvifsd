package firsttaskloop;

import java.util.Scanner;

public class DiscountForPurchaseAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner scannerObject = new Scanner(System.in);
		  
	      System.out.print("Enter Purchase Amount: ");
	      
	      double amt = scannerObject.nextInt();
	      int d = 0;
	        
	       
	        if(amt <= 1000 && amt>= 500)
	            d = 10;
	        
	        else if(amt>1000)
	            d = 20;
	        else
	        	 if (amt < 500)
	 	        	System.out.println("No Discount For Below 500");
	 	        
	            
	        double discAmt = amt * d / 100.0;
	        double finalAmtAfterDiscount = amt - discAmt;
	        
	        System.out.println("Purchase Amount is: " + amt);
	        System.out.println("Final Payable Amount is: " + finalAmtAfterDiscount);
	    }
	}
