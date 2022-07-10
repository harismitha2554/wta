import java.io.*;
import java.util.*;
 public class file_handling1{
public static void main(String[] args)throws IOException{
try{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the file name");
String file_name=sc.nextLine();
BufferedReader br=new BufferedReader(new FileReader(file_name));
Scanner sr=new Scanner(br);
System.out.println("The file Contents are:");
while(sr.hasNextLine()){
String data=sr.nextLine();
System.out.println(data);
}
}
catch(Exception e){

System.out.println(e);}}}