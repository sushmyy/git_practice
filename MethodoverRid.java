package source;
class Bank
{
	double getInterest()
	{
		return 7.6;
	}
}

class SBI extends Bank
{
	double getInterest()
	{
		return 5.5;
	}
}

class Axis extends Bank
{
	double getInterest()
	{
		return 6.1;
	}
}

class Canara extends Bank
{
	double getInterest()
	{
		return 5.8;
	}
}

public class MethodoverRid {

	public static void main(String[] args) {
		Bank s=new SBI();
		Bank a=new Axis();
		Bank c=new Canara();
		System.out.println("The interest rate of SBI bank is "+s.getInterest());
		System.out.println("The interest rate of Canara bank is "+c.getInterest());
		System.out.println("The interest rate of Axis bank is "+a.getInterest());

	}

}
