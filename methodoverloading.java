class methodoverloading{
public static void display(int a){
System.out.println("Argument"+a);}
public static void display(int a,int b){
System.out.println("Argument:"+a+"and"+b);}

public static void main(String[] args){
 display(1);
display(1,2);
}
}
