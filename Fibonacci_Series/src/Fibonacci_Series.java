import java.util.*;
public class Fibonacci_Series 
{
	static void fibonacciSeries(int n)
	{
		int i;
		int [] arr=new int[n];
		System.out.println("The fibonacci series is as follows:");
		if(n==1)//In case only 1 is entered
			arr[0]=0;
		if(n==2)//In case only 2 is entered
			{
				arr[0]=0;
				arr[1]=1;
			}
		if(n>2)//In case number of elements more than 2
		{
			arr[0]=0;/*Initializing  first two elements*/
			arr[1]=1;
			for(i=2;i<n;i++)
				arr[i]=arr[i-1]+arr[i-2];
		}
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter number of elements till which you need Fibonacci series:");
		Scanner reader=new Scanner(System.in);
		int n=reader.nextInt();
		reader.close();
		fibonacciSeries(n);
	}

}
