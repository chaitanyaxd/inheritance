class Poly{

	static void sdd(int a,int b){
		System.out.println(a+b);
	}
	static void sdd(int[] a){
		for(int i=0;i<a.length;i=i+1){
	System.out.println(a[i]);
		}
	}
	void sdd(String s){
		System.out.println(s);
	}
	void sdd(double x,double y){
		System.out.println(x*y);
	}
	public static void main(String[]args){
	Poly sd=new Poly();
	sd.sdd(2,4);
	int[] a={12,34,33,45,32};
	sd.sdd(a);
	String s=new String("chaitanya");
	sd.sdd(s);
	sd.sdd(1.3,3.2);
}
}