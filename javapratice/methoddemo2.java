package javapratice;

public class methoddemo2
{

	public static void main(String[] args)
	{
		func();
		methoddemo2 m1=new methoddemo2();
	m1.	funA();
	m1.	funB();
		
				
System.out.println("main method of methoddemo2 ");
	}
	void funA()
	{
		System.out.println("funA of methoddemo2"  );
		
	}
	void funB()
	{
		System.out.println("funB of methoddemo2");
		
	}
	static void func()
	{
		System.out.println("func of methoddemo2");
	}

}
