package javapratice;

public class methoddemo4
{

	public static void main(String[] args)
	{
System.out.println("main method of methoddemo4");
funA();
System.out.println("done");
	}
static void funA()
{
	System.out.println("funA of methoddemo4 ");
	funC();
}
static void funB()
{
	System.out.println("funB of methoddemo4");
}
static void funC()
	{
		System.out.println("func of methoddemo4");
		funB();
	}
	
			

}
