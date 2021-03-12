class Multiplication{
void mul(int a,int b){
	System.out.println(a*b);
}
void mul(int a,int b,int c){
	System.out.println(a*b*c);
}
	void mul(int x,double y){
	System.out.println(x*y);
	}
	
	void mul(int a,double b,int d){
	System.out.println(a*b);
	}
	
		public static void main(String[]args){
			Multiplication sd=new Multiplication();
			sd.mul(2,3);
			sd.mul(2,3,4);
			sd.mul(3,3.5);
			sd.mul(3,4.5,5);
		}
	
}