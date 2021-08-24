import java.util.*;
public class Perfect_Number 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number to find it whether it is perfect number or not:");
		Scanner reader=new Scanner(System.in);
		int number=reader.nextInt();
		reader.close();
		int sum=0,i=1;
		while(i<number)
		{
			if(number%i==0)//if number is divisible by numbers smaller than it then add it to sum
				sum+=i;
			i++;
		}
		if(sum==number)//Checking whether it is perfect number or not
			System.out.println(number+" is a perfect number");
		else
			System.out.println(number+" is not a perfect number");
	}

}
