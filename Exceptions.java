class Exceptions
{
   public static void main(String args[])
   {
///ArithmeticException
      try{
         int num1=30, num2=0;
         int output=num1/num2;
         System.out.println ("Result: "+output);
      }
      catch(ArithmeticException e){
         System.out.println ("You Shouldn't divide a number by zero");
      }
/////////ArrayIndexOutOfBoundsException
try{
        int a[]=new int[10];
        //Array has only 10 elements
        a[11] = 9;
      }
      catch(ArrayIndexOutOfBoundsException e){
         System.out.println ("ArrayIndexOutOfBounds");
      }
/////NumberFormatException

try{
	 int num=Integer.parseInt ("XYZ") ;
	 System.out.println(num);
      }catch(NumberFormatException e){
	  System.out.println("Number format exception occurred");
       }

////StringIndexOutOfBoundsException

try{
	 String str="beginnersbook";
	 System.out.println(str.length());;
	 char c = str.charAt(0);
	 c = str.charAt(40);
	 System.out.println(c);
      }catch(StringIndexOutOfBoundsException e){
	  System.out.println("StringIndexOutOfBoundsException!!");
       }
/////NullPointer Exception
		try{
		String str=null;
		System.out.println (str.length());
	}
        catch(NullPointerException e){
		System.out.println("NullPointerException..");
	}
   }
}
