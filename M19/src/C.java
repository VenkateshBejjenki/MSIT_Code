public class C extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			//if(i == 4) stop();
			if(i%2==0)
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			System.out.println("A:" +i);
		}
		System.out.println("Exit from A");
	}
	
	public static void main(String args[])
	{
		C c = new C();
		c.start();
	}
}