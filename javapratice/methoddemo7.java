package javapratice;

public class methoddemo7
{

	public static void main(String[] args)
	{
System.out.println("main method starts");
methoddemo7 d1=new methoddemo7();
d1.funA();

	}
void funA()
{
	System.out.println("funa of methoddemo7");
	methoddemo7 d1= new methoddemo7();
	d1.funB();
}
 void funB()
{
	System.out.println("funB of methoddemo4");
}
}
