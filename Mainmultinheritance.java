import java.io.*;//multiple interface implementation
interface i1
{
void disp();
}
interface i2
{
void print();
}
class c1 implements i1,i2
{
public void disp()
{
System.out.println("in disp c1");
}
public void print()
{
System.out.println("in print i2");
}
}
class Mainmultinheritance
{
public static void main(String args[])
{
c1 obj = new c1();
obj.disp();
obj.print();
}
}
