class Polymor{
static void poly(int x,int y){
	System.out.println("sum:"+(x+y));
}
static void poly(int x,int y,double z){
	System.out.println("sum:"+(x+y+z));
}
	 void poly(double x,double y){
	System.out.println("mul:"+(x*y));
	 }
	 void poly(int x,double y){
	System.out.println("devide:"+(x/y));
	 }
	 public static void main(String[] args){
		 Polymor p=new Polymor();
		 p.poly(2,3);
		 p.poly(3,4,50);
		 p.poly(3.4,3.5);
		 p.poly(8,4.5);
	 }
}