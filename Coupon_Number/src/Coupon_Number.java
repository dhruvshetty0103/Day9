/*I really don't think that the problem statement is to generate random 3 digit number 
 * as coupon numbers but as explained by the instructor I have done this
 */

import java.util.*;
public class Coupon_Number 
{
	static int randomNumberGenerator()
	{
		return (int) ((Math.random() * (999 - 100)) + 100);
	}
	public static void main(String[] args) 
	{	
		System.out.println("Enter number of distinct coupons to be generated:");
		Scanner reader=new Scanner(System.in);
		int numberOfCoupons=reader.nextInt();
		int[] listOfCoupons=new int[numberOfCoupons];
		for(int i=0;i<listOfCoupons.length;i++)
		{
			int temp=randomNumberGenerator();
			for(int j=0;j<i;j++)
				if(listOfCoupons[j]!=temp)
					listOfCoupons[i]=temp;
			if(i==0)
				listOfCoupons[i]=temp;
		}
		for(int i=0;i<listOfCoupons.length;i++)
			System.out.println(listOfCoupons[i]);
		reader.close();
	}
}