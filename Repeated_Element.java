import java.util.Scanner;

public class Repeated_ele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] A= new int [5];
		for(int i=0;i<A.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the element " + i);
			A[i]=sc.nextInt();
			
			
		}
		//int[] A = { 1, 2, 4, 5, 1 };
		
		
		int count = 0;

		for (int i = 0; i < A.length; i++) 
		{
			for (int j = i + 1; j < A.length; j++)
			{
				if (A[i] == A[j]) 
				{
				    count++;
					if(count>0)
					{
						System.out.println(A[i] + " is repeated in array");
					}
					
				}

			}
			

		}

	}

}


