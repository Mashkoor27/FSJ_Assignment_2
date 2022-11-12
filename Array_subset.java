import java.util.Scanner;

public class Array_Subset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A= new int[5];
		for(int i=0;i<A.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of element "+ i+ " in Array A");
			A[i]=sc.nextInt();
		}
		
		int[] B= new int[2];
		for(int i=0;i<B.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of element "+ i+ " in Array B");
			B[i]=sc.nextInt();
		}

	//	int [] A= {1,2,3,4,5,6,7,8,2,3,4};
    //  int [] B= {2,3,4,7};
		int count =0;
		
		for(int i=0;i<B.length;i++)
		{
			for(int j=0;j<A.length;j++)
			{
				if(B[i]==A[j])
				{
					count ++;
					break;
				}
				
			}
		}
		
		if(count == B.length)
		{
			System.out.println("Array B is a Subset of array A");
		}
		else
		{
			System.out.println("Array B is not a Subset of array A");
		}
	}

}
