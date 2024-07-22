package firsttaskloop;

public class ReverseGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 876;
		int reverseNum = 0;
		while( num != 0 )
	      {
			reverseNum = reverseNum * 10;
			reverseNum = reverseNum + num%10;
	        num = num/10; 
	      }
		System.out.println("Reverse of 876 is : "+ reverseNum);

		
	}
	

}
