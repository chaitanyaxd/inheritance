class Parent{
	void m1(){
		int x=12,y=13;
		int z=x+y;
		System.out.println("sum:"+z);
	}
}
class Child extends Parent{
	void m2(){
		double a=1.2,b=2.3;
		double c=a*b;
		System.out.println("mul:"+c);
	}
}
class Teacher extends Child{
	void m3(){
		char f='d';
		System.out.println(f);
	}
}
class InheritanceAdd{
	public static void main(String[] args){
		Teacher td=new Teacher();
		td.m1();
		td.m2();
		td.m3();
	}
}
