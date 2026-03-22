package Threat;

public class SleepyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t=new Thread(new Runnable() {
public void run()
{
	System.out.println("Thread starting");
	try
	{
		Thread.sleep(3000);
		
	}
	catch(InterruptedException e)
	{
		e.printStackTrace();
		
	}
}
		})

	}

}
