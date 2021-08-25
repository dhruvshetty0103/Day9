import java.util.*;
public class Reverse_Number 
{
	public static void main(String[] args) 
	{
		int reverseNumber=0,remainder=1;
		System.out.println("Enter number to reverse it:");
		Scanner reader=new Scanner(System.in);
		int toReverseNumber=reader.nextInt();
		reader.close();
		while(0<toReverseNumber)//Until we reach 0
		{
			/*Following the logic provided 
			  in the problem statement*/
			remainder=toReverseNumber%10;
			reverseNumber=(reverseNumber*10)+remainder;
			toReverseNumber=toReverseNumber/10;
		}
		System.out.println("Reverse number is:"+reverseNumber);
	}
}
