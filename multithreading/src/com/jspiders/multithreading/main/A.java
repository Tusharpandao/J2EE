package com.jspiders.multithreading.main;

public class A {

	A(){
		System.out.println("Class A Costructor");
	}
	int a=10;
	public void testA() {
		System.out.println("TestA Method");
	}
	
	{
		System.out.println("Non Static Block -A");
	}
}

class B extends A{
	int b=20;
	public void testB() {
		System.out.println("testB()");
	}
	{
		System.out.println("non static Block B");
	}
	B(){
		System.out.println("B()");
	}
	
}
class C extends B{
	int c=30;
	public void testC() {
		
		System.out.println("testC()");
	}
	{
		System.out.println("NS-Block-C");
	}
	public static void main(String[] args) {
		C obj=new C();
		
		obj.testA();
		obj.testB();
		obj.testC();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
	}
}
