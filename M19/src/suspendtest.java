class Co extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("Co : " +i);
		}
		System.out.println("Exit from Co");	
	}
}
class A extends Thread
{
	public void run()
	{
		for(int i = 1; i <= 5; i++)
		{
			System.out.println("A:" +i);
		}
		System.out.println("Exit from A");
	}
}

class suspendtest
{
	public static void main(String args[])
	{
		Co c = new Co();
		A a = new A();
		c.start();
		a.start();
		c.suspend();
		c.resume();
	}
}