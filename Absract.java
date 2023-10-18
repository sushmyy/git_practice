package source;
abstract class Subject1
{
	Subject1()
	{
		System.out.println("calculation of two methods");
	}
	
	abstract float addfloat1(float a, float b);
	abstract float addfloat2(float x,float y,float z);
}
    class Sub extends Subject1
    {
    	float addfloat1(float a, float b)
    	{
    		return a+b;
    	}
    	float addfloat2(float x, float y, float z)
    	{
    		return x+y+z;
    	}
    }

public class Absract {

	public static void main(String[] args) {
		Sub obj=new Sub() ;
        float m1=obj.addfloat1(2.2f,4.4f);
        System.out.println(m1);
        float m2=obj.addfloat2(2.4f,4.6f,6.8f);
        System.out.println(m2);
	}

}
