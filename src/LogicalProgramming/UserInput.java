package LogicalProgramming;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter your name");
        String name=scanner.next();
        System.out.println("Entered name is "+name);

        System.out.println("Please enter your roll number");
        int rollNo=scanner.nextInt();

        System.out.println("Please enter your marks");
        Float marks=scanner.nextFloat();
    }




}
