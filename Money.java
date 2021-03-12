class Thousand{
void m1(){
	int x=100,y=200;
	int z=x+y;
	System.out.println("money:"+z);
}
}
class Hundread extends Thousand{
void m2(){
int a=1000,b=500;
int c=a+b;
System.out.println("money:"+c);
}
}
class Rupees extends Hundread{
void m3(){
int d=5,e=6,f=7;
int r=d*e*f;
System.out.println("mul:"+r);
}
}
class Money{
public static void main(String[] args){
Rupees	sd=new Rupees();
sd.m1();
sd.m2();
sd.m3();
}
}	
