import java.util.StringTokenizer;
import java.util.Scanner;

class Employee {
    String Name;
    String ID;
    String Salary;

    Employee() {
        System.out.println("Employee class is created ");
    }
}

public class string_tokenizer {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name , ID and Salary of the Employee");
        String details = sc.nextLine();

        StringTokenizer st = new StringTokenizer(details);

        Employee Kishore = new Employee();
        Kishore.Name = st.nextToken();
        Kishore.ID = st.nextToken();
        Kishore.Salary = st.nextToken();

        System.out.println("Kishore Details \n" + "Name : " + Kishore.Name + "\nSalary : " + Kishore.Salary + "\nID : " + Kishore.ID );
    }
}
