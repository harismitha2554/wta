import java.util.Scanner;

class Student {
    String name;
    String USN;
    String Branch;
    String Phone;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setUSN(String USN) {
        this.USN = USN;
    }
    public String getUSN() {
        return USN;
    }

    public void setBranch(String Branch) {
        this.Branch = Branch;
    }
    public String getBranch() {
        return Branch;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }
    public String getPhone() {
        return Phone;
    }
}

class student_details {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Number of Students : ");
        int n = Integer.parseInt(s.nextLine());

        Student[] StudentList = new Student[n];

        for (int i = 0; i < n; i++) {
            StudentList[i] = new Student();
            System.out.println("\nEnter the details of Student " + (i + 1));
            System.out.println("Enter the Name : ");
            String Name = s.nextLine();
            StudentList[i].setName(Name);
            System.out.print("Enter the USN : ");
            StudentList[i].setUSN(s.next());
            System.out.print("Enter the Branch : ");
            StudentList[i].setBranch(s.next());
            System.out.print("Enter the Phone Number : ");
            StudentList[i].setPhone(s.next());
        }

        System.out.println("\nDetails of the Students : ");

        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent 1");
            System.out.println("\nName : " + StudentList[i].getName());
            System.out.println("USN : " + StudentList[i].getUSN());
            System.out.println("Branch : " + StudentList[i].getBranch());
            System.out.println("Phone : " + StudentList[i].getPhone());
        }

        s.close();
    }
}