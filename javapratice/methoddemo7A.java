package javapratice;

public class methoddemo7A
{

	public static void main(String[] args)
	{
System.out.println("main method starts");
methoddemo7A d1=new methoddemo7A();
d1.funA();
methoddemo7A d2 =new methoddemo7A();
d2.funB();
	}
	void funA()
	{
		System.out.println("funa of methoddemo7A");
	}
	void funB()
	{
		System.out.println("funb of methoddemo7A");
		

}
}