package firsttaskloop;

public class PatterProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=5;i>=1;i--)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print(j);
			}
			
			for(int k=i;k>=1;k--)
			{
				System.out.print(i);
			}
			System.out.println();
		}

	}

}
