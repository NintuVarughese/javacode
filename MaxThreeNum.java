import java.io.*;

class MaxThreeNum
{
	public static void main(String args[])
		{
			DataInputStream values;
			int a,b,c;
			String n,name;
			values = new DataInputStream(System.in);

try
{
			System.out.println("Enter Your name:");
			name = values.readLine();
			System.out.println("Hello, " + name + "!");
			System.out.println("Enter Your value for a:");
			n = values.readLine();
			a = Integer.parseInt(n);
			System.out.println("Enter Your value for b:");
			n = values.readLine();
			b = Integer.parseInt(n);
			System.out.println("Enter Your value for c:");
			n = values.readLine();
			c = Integer.parseInt(n);

			if (a>b && a>c)
				System.out.println("Max value among these num is: " +a);
			else if (b>c)
				System.out.println("Max value among these num is: " +b);
			else
				System.out.println("Max value among these num is: " +c);


}
catch(Exception e)
{
	System.out.println("Error :" + e);
}

		}

}