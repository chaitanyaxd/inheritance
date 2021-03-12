class StringDemo{
public static void main(String[]args){
String s1= new String("krishna chaitanya");
char[] s=s1.toCharArray();
for (int i=s.length-1;i>=0;i--){
System.out.println(s[i]);
}
}
}