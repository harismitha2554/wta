public class Decision_making {
    public static void main(String[] args) {
        // If statement
        if (true)
            System.out.println("This is a if statement");

        // If else Statement
        if (false)
            return;
        else
            System.out.println("This is if-else statement");

        // Nested if else
        if (8 % 2 == 0) {
            if (8 % 4 == 0)
                System.out.println("8 is divisible by 2 and 4 - Nested if else");
        }
       //switch
int n=44;
String size;
switch(n){
case 5:
size="small";
break;
case 12:
size="big";
break;
case 44:
size="medium";
break;
default:
size="unknown";
break;}
        System.out.println("size"+size);
}}