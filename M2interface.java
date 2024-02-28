import java.io.*;//interface methoud can invoke other method present in the class
interface i1
{
public void disp();
public void print();
}
class c1 implements i1
{
public void disp()
{
System.out.println("interface disp");
}
public void print()
{
draw();
System.out.println("interface print");
}
private void draw()
{
System.out.println("draw not in interface");
}
}
class M2interface
{
public static void main(String args[])
{
i1 obj;
obj=new c1();
obj.disp();
obj.print();
}
}