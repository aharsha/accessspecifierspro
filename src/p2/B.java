package p2;

import p1.A;

public class B extends A
{
	void m2()
	{
//v1=10;
//v2=20;
v3=40;//protected member can be accessble in sub class
v4=50;
	}
	
	void m5()
	{
		A a=new A();
	//	a.v3=45;
	}
}
