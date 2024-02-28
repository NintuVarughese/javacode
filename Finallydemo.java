import java.io.*;
class Finallydemo
{
public static void main(String args[])
{
int a,b,c;
DataInputStream din = new DataInputStream(System.in);
String s;
try
{
System.out.println("Enter the first number");
s=din.readLine();
a=Integer.parseInt(s);
System.out.println("enter the second number");
s=din.readLine();
b=Integer.parseInt(s);
c=a/b;
System.out.println("c =" +c);
}
catch(Exception e)
{
System.out.println("unknown error " +e);
}
finally{
System.out.println("i am here");
}
}
}
