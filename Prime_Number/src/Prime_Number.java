import java.util.*;
public class Prime_Number 
{
	public static void main(String[] args) 
	{
		int flag=0;
		System.out.println("Enter a positive number to check whether it is prime number or not:");
		Scanner reader=new Scanner(System.in);
		int checkNumber=reader.nextInt();
		reader.close();
		if(checkNumber==1)//if number is 1 then display that it is neither prime or composite number
			System.out.println(checkNumber+" is neither prime nor composite number");
		else
		{
			if(checkNumber==2 || checkNumber==3)//if number is 2 or 3 then display that it is prime number
				System.out.println(checkNumber+" is a prime number");
			else
			{
				for(int i=2;i<checkNumber;i++)//Logic to check whether the number entered is prime or composite
				{
					if(checkNumber%i==0)
						flag++;//if flag value is changed then it is a composite a composite number
				}
				if(flag==0)
					System.out.println(checkNumber+" is prime number");
				else
					System.out.println(checkNumber+" is a composite number");
			}
		}
	}
}