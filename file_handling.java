import java.io.*;
import java.util.*;
public class file_handling{
public static void main(String[] args) throws IOException{

Scanner sc=new Scanner(System.in);
System.out.println("Enter the file path:");
String file_path=sc.nextLine();
File object=new File(file_path);
if (object.exists()){
System.out.println("The File name is:"+object.getName());
System.out.println("The absolute path is:"+object.getAbsolutePath());
System.out.println("File readable is:"+object.canRead());
System.out.println("The File name is:"+object.canWrite());
System.out.println("The File length is:"+object.length());}
else{
System.out.println("File does not exists");
}
}
}