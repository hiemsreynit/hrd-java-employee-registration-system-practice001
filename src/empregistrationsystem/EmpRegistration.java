package empregistrationsystem;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

enum EmployeeType {
    FULL_TIME,
    PART_TIME
}

public class EmpRegistration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id;
        String name;
        String email;
        int age;
        float oriSalary;
        String empType;

        System.out.println("+".repeat(60));
        System.out.println("EMPLOYEE REGISTRATION SYSTEM");
        System.out.println("+".repeat(60));

        System.out.print("Enter ID: ");
        id = input.nextInt();
        input.nextLine();
        System.out.print("Enter NAME: ");
        name = input.nextLine();
        System.out.print("Enter EMAIL: ");
        email = input.nextLine();
        System.out.print("Enter AGE: ");
        age = input.nextInt();
        System.out.print("Enter ORIGINAL SALARY: ");
        oriSalary = input.nextFloat();
        input.nextLine();
        System.out.print("Enter EMPLOYEE TYPE (FULL_TIME, PART_TIME): ");
        empType = input.nextLine();

        String idValidation = (id <= 0) ? "INVALID ID!" : "ID: " + id;
        String ageValidation = (age >= 18 && age <= 65) ? "AGE: " + age : "AGE: 0";
        String oriSalaryMessage = (oriSalary < 0) ? "ORIGINAL SALARY: 0" : "ORIGINAL SALARY: " + oriSalary;

        Pattern p = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
        Matcher m = p.matcher(email);
        String emailValidation = (m.matches()) ? "EMAIL: " + email : "INVALID EMAIL!";

        Pattern p1 = Pattern.compile("^[a-zA-Z.]{3,30}$");
        Matcher m1 = p1.matcher(name);
        String nameValidation = (m1.matches()) ? "NAME: " + name : "INVALID NAME!";

        Pattern p2 = Pattern.compile("\\bFULL_TIME|PART_TIME\\b");
        Matcher m2 = p2.matcher(empType);
        String empTypeValidation = (m2.matches()) ? "EMPLOYEE'S TYPE: " + empType : "EMPLOYEE'S TYPE: Null";

        String finalSalary = (EmployeeType.FULL_TIME.equals(empTypeValidation)) ? "ORIGINAL SALARY: " + oriSalary : "FINAL SALARY: " + oriSalary * 0.6;

        System.out.println("=".repeat(50));
        System.out.println("EMPLOYEE INFORMATION");
        System.out.println("=".repeat(50));
        System.out.println(idValidation);
        System.out.println(nameValidation);
        System.out.println(ageValidation);
        System.out.println(empTypeValidation);
        System.out.println(oriSalaryMessage);
        System.out.println(finalSalary);
        System.out.println(emailValidation);
    }
}


