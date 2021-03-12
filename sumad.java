class SumAd{
public static void main(String[] args){
int sum=0,capacity=15;
for(int i=0;i<=100;i++){
	System.out.println(i);
sum=sum+i;
if(sum>=capacity) 
break;	
}
System.out.println(sum);

}
}