package LogicalProgramming;

import java.util.Scanner;

public class ReverseStringUsingInput {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter the String :");
         String givenStr =scanner.next();
         String revStr= "";


        for(int i=givenStr.length()-1;i>=0;i--)
        {
            revStr = revStr + givenStr.charAt(i);
        }

        System.out.println("Reversed string is "+revStr);
    }
}
