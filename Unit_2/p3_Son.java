class Father
{
	void house()
	{
		System.out.println("Father House");
	}
}

class p3_Son extends Father
{
	void bike()
	{
		System.out.println("Its my bike");
	}
	public static void main(String args[])
	{
	Son ob = new Son();
	ob.bike();
	ob.house();
	}
}
