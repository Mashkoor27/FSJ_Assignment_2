import java.util.Scanner;

public class Merge_sort {
	
	public void conquer(int[ ] A, int start ,int mid, int end )
	{
		int merged[]=new int[end-start+1];
		 int indx1=start;
		 int indx2=mid+1;
		 int x=0;
		 
		 
		 while(indx1 <=mid && indx2 <= end)
		 {
			 if(A[indx1]<= A[indx2])
			 {
				 merged[x]=A[indx1];
				 x++ ;
				 indx1++;
			 }
			 else
			 {
				 merged[x]=A[indx2];
				 x++ ;
				 indx2++;
		     }
		 }
		 while(indx1 <=mid)
		 {
			 merged[x]=A[indx1];
			 x++ ;
			 indx1++;
		 }
		 while(indx2 <= end)
		 {
			 merged[x]=A[indx2];
			 x++ ;
			 indx2++;
		 }
		 
		 for(int i=0 ,j=start;i<merged.length;i++,j++)
		 {
			 A[j]= merged[i];
			 
		 }
			 
		 
		
	}
	
	public void divide(int[ ] A, int start , int end)
	{
		
		if(start>= end)
		{
			return;
		}
		int mid=(start+end)/2;
		divide(A, start, mid);
		divide(A, mid+1,end);
		conquer(A, start,mid,end);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int[] A= {3,1,5,2,7,4,9};
		int[] A= new int[5];
		for(int i=0;i<A.length;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the value of element "+ i+ " in Array A");
			A[i]=sc.nextInt();
		}
		int n= A.length;
		
		
		Merge_sort M= new Merge_sort();
		M.divide(A, 0, n-1);
		
		for(int i=0;i<A.length;i++)
		{
			System.out.print(A[i]+ " ");
		}
		System.out.println();

	}

}

