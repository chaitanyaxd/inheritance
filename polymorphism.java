class Addition{
void add(int x,int y){
System.out.println("result1:"+(x+y));
}
void add(int x,int y,float z){
System.out.println("result2:"+(x+y+z));
}
void add(double x,int y){
System.out.println("result3:"+(x+y));
}
void add(int x,double y){
System.out.println("result4:"+(x+y));
}
static public void main(String[] args){
Addition ad=new Addition();
ad.add(2,4);
ad.add(2,4,4.5);
ad.add(3.5,5);
ad.add(5,5.6);
}
}