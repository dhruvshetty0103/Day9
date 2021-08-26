import java.util.*;
public class Stopwatch 
{
	
	static long startTime,endTime;
	static void start() 
	{
		startTime = System.currentTimeMillis();
		System.out.println("Stop watch started");
		System.out.println("Start time:"+((startTime)%60000)/1000+" seconds at system clock hand");
		/*Converting 13 digit time stamp to milliseconds by doing modulus 60000 
		 * and then dividing by 1000 to get seconds for start time
		 */
	} 
	static void stop() 
	{
		endTime = System.currentTimeMillis();
		System.out.println("Stop watch stopped");
		System.out.println("End time:"+((endTime)%60000)/1000+ " seconds at system clock hand");  
		/*Converting 13 digit time stamp to milliseconds by doing modulus 60000 
		 * and then dividing by 1000 to get seconds for end time also
		 */
	}
	static void calculate()
	{
		System.out.println("The elapsed time between start and end is "+((endTime-startTime)/1000)+" seconds");
		/*Here the difference we will get in milliseconds so only dividing the
		 * it by 1000 to it into seconds
		 */
	}
	
	public static void main(String[] args) 
	{
		Scanner reader=new Scanner(System.in);
		System.out.println("Enter option 1 to start the stopwatch and option 2 to end the stopwatch.");
		int option=reader.nextInt();
		if(option==1)
		{
			start();
			System.out.println("Press 2 and enter to end stopwatch");
			option=reader.nextInt();
			if(option==2)
				stop();
		}
		reader.close();
		calculate();
	}
}