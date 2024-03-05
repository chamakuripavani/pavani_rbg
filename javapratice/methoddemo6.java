package javapratice;

public class methoddemo6
{

	public static void main(String[] args)
	{
		System.out.println("main method starts");
		funB();
	}
	void funA()
	{
		System.out.println("funa ofmethoddemo6");
	}
	static void funB()
	{
	System.out.println("funb of methoddemo6");
	methoddemo6 d1 =new methoddemo6();
	d1.funA();
	}

}
