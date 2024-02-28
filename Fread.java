import java.io.*;
import java.util.*;
class Fread{
public static void main(String args[]){
FileInputStream Fin;
Scanner s = new Scanner(System.in);
String Fname;
try{
System.out.println("enter the file name");
Fname=s.nextLine();
Fin=new FileInputStream(Fname);
int ch;
ch=Fin.read();

Fin.close();
}
}
catch(Exception e){
System.out.println("error "+e);
}
}
