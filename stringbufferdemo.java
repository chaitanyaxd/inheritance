class StringBufferDemo{
public static void main(String[]args){
StringBuffer sb=new StringBuffer("chaitanya");
StringBuffer sb1=new StringBuffer("krishna");
for(i=0;i<sb.length;i++){

System.out.println(sb);
}
System.out.println(sb1.deleteCharAt(1));
}
}