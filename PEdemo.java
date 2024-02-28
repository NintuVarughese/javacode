//try with multiple catch statement
import java.io.*;
class PEdemo{
public static void main(String args[]){
int a,b,c;
DataInputStream din = new DataInputStream(System.in);
String s;
try{
System.out.println("enter the first number");
s=din.readLine();
a=Integer.parseInt(s);
System.out.println("enter the second number");
s=din.readLine();
b=Integer.parseInt(s);
c=a/b;
System.out.println("c= "+c);
}
catch(IOException e1)
{
System.out.println("unable to read from io device" +e1);
}
catch(NumberFormatException e2){
System.out.println("input string not a number" +e2);
}
catch(ArithmeticException e3)
{
System.out.println("dr is o" +e3);
}
catch(Exception e4){
System.out.println("unknown error"+e4);
}
}
}
