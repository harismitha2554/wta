class constructor{
String language;
constructor(){
this.language="Java";}
constructor(String language){
this.language=language;}
public void getname(){
System.out.println("The programming language is"+this.language);}
public static void main(String[] args){
constructor obj1=new constructor();
constructor obj2=new constructor("Python");
obj1.getname();
obj2.getname();}}