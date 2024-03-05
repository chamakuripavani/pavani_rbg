package javapratice;

public class methoddemo5
{

	public static void main(String[] args)
	{
		System.out.println("main method ofmethoddemo5 " );
		methoddemo5 m1=new methoddemo5();
m1.func();
		
		

	}
	static void funA()
	{
		System.out.println("funa of methoddemo4");
	}
	static void funB()
	{
		System.out.println("funb ofmethoddemo4");
		funA();
	}
	void func()
	{
		System.out.println("func of methoddemo4");
		funB();

}
}