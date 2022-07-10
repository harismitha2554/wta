// THROWS KEYWORD

public class throws_keyword {

    static void division() throws ArithmeticException {
            int result = 100/0;
    }
    
    public static void main(String args[])
    {
        try {
            division();
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occured - cannot divide a number by zero");
        }
    }
}