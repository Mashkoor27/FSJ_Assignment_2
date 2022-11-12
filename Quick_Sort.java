import java.util.Scanner;

public class Quick_sort {
	
	private static int partition(int[] A, int low, int high) {
		int pivot=A[high];
		int i=low-1;
		
		for(int j=low;j<high;j++)
		{
			if(A[j]<pivot)
			{
				i++;
				int temp=A[i];
				A[i]= A[j];
				A[j]=temp;
			}
		}
		i++;
		int temp= A[i];
		A[i]= pivot;
		A[high]=temp;
		
		return i;
	}
	
	private static void quickSort(int[] A, int low, int high) {
		if(low < high)
		{
			int pidx =partition(A, low , high);
			quickSort(A, low , pidx-1);
			quickSort(A, pidx+1,high);
		}
		
	}



	public static void main(String[] args) {
	//int[ ] A= {2,5,2,1,0};
	
		int[] A= new int[5];
		for(int i=0;i<A.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of element "+ i+ " in Array A");
			A[i]=sc.nextInt();
		}
		int n= A.length;
		
		quickSort(A,0,n-1);
		for(int i=0;i<n;i++)
		{
			System.out.print(A[i]+" ");
		}
		
	}
	
	

	

}




