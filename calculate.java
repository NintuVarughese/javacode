import java.io.*;
import java.util.*;
public class calculate
{
public static void main(String args[])
{
int a,b,sum,diff,mult,divi,mod;

a=Integer.parseInt(args[0]);
b=Integer.parseInt(args[1]);

sum=a+b;
diff=a-b;
mult=a*b;
divi=a/b;
mod=a%b;



System.out.println("sum= "+sum);
System.out.println("difference= "+diff);
System.out.println("mult= "+mult);
System.out.println("div= "+divi);
System.out.println("mod= "+mod);

}
}