import java.util.Scanner;

public class selection_sort {

	public static void main(String[] args) {
		
		//int [] A= {3,2,1,4,6,5};
		int[] A= new int[5];
		for(int i=0;i<A.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of element "+ i+ " in Array A");
			A[i]=sc.nextInt();
		}
		
		for(int i=0;i<A.length-1;i++)
		{
			int smallest= i;
			for(int j=i+1;j<A.length;j++)
			{
				if(A[smallest]>A[j])
				{
					smallest=j;
					
				}
			}
			int temp= A[smallest];
			A[smallest]=A[i];
			A[i]= temp;
			
		}
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+ " ");
		}
		
	}

}

