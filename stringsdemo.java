import java.lang.*;
class stringsdemo{
public static void main(String[] args){
System.out.println("String functions");
String str=" Harismitha";
System.out.println("Length function"+str.length());
System.out.println("Isempty function"+str.isEmpty());
System.out.println("IsBlankfunction:"+str.isBlank());
System.out.println("charAt Function:"+str.charAt(1));
System.out.println("Equals function:"+str.equals("smitha"));
System.out.println("equalignore case function:"+str.equalsIgnoreCase("smitha"));
System.out.println("compare:"+str.compareTo("Harismitha"));
System.out.println("compare to ignore case"+str.compareToIgnoreCase("H"));
System.out.println("starets and ends with"+str.startsWith("H")+""+str.endsWith("a"));
System.out.println("substring"+"smitha".substring(1,4));
System.out.println("concat"+"Hari".concat("smitha"));
System.out.println("replace"+str.replace("s","m"));
System.out.println("replace first"+str.replaceFirst("H","HH"));
System.out.println("replace all"+str.replaceAll("Harismitha","harismitha"));
System.out.println("contains"+str.contains("smitha"));
StringBuffer s=new StringBuffer("smitha");
System.out.println("reverse"+s.reverse());
System.out.println("split:");
String[] arr=str.split(" ");
for(String ele:arr){
System.out.println(ele+" ");}
System.out.println("join"+str.join("-","Hari","smitha"));
System.out.println("tolowercase"+str.toLowerCase());
System.out.println("touppercase"+str.toUpperCase());
System.out.println("trim"+ str.trim());
}}