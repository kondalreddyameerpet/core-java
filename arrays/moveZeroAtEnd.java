package arrays;

import java.util.*;

public class moveZeroAtEnd 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Print the size of the array:");
		int n = sc.nextInt();
		int arr[]=new int[n];
		int fin[]=new int[n];
		int l=0;
		int m=n-1;
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]!=0)
			{
				fin[l]=arr[i];
				l++;
			}
			else
			{
				fin[m]=0;
				m--;
			}
		}
		
		for(int z=0;z<n;z++)
		{
			System.out.println(fin[z]);
		}
		
		
		
		
	}

}