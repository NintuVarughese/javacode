import java.io.*;
class Person{
int age;
String Name;
public void readp()
{
DataInputStream din = new DataInputStream(System.in);
try
{
System.out.println("enter the name and age:");
Name = din.readLine();
age = Integer.parseInt(din.readLine());
}
catch(Exception e){
}
}
public void disp()
{
System.out.println("Name:" +Name+ "Age:" +age);
}
}
class Teacher extends Person{
String subj;
public void readt()
{
DataInputStream din = new DataInputStream(System.in);
try{
System.out.println("enter subject");
subj=din.readLine();
}
catch(Exception e){
}
}
public void dispt()
{
System.out.println("subject :" +subj);
}
}
public class Mains
{
public static void main(String args[])
{
Person p;
Teacher t;
p = new Person();
t = new Teacher();
p.readp();
t.readp();
//t.readt();
p.dispp();
t.dispp();
t.dispt();
}
}
