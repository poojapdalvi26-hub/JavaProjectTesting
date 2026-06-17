package LogicalProgramming;

import java.util.Scanner;

public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        System.out.println("Enter the number");
        int  num =scanner.nextInt();

        if(num==0)
        {
            System.out.println("number is zero can't define even or odd");
        }
        if(num% 2==0)
        {
            System.out.println("Number is even ");
        }
        else
            System.out.println("Number is odd");
    }
}
