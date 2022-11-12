import java.util.Scanner;

public class Bubble_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A= new int[5];
		for(int i=0;i<A.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of element "+ i+ " in Array A");
			A[i]=sc.nextInt();
		}
		
		for(int i=0;i<A.length;i++)
		{
			for(int j=1;j<A.length-i;j++)
			{
			if(A[j]<A[j-1])	
			   {
				int temp=A[j-1];
				A[j-1]= A[j];
				A[j]=temp;
				
			   }
			}
		}
		
		for(int ele: A)
		{	
			System.out.print(ele +" " );
		}
		
		
		

	}

}





