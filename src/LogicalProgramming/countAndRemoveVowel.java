package LogicalProgramming;

import java.sql.SQLOutput;
import java.util.Scanner;

public class countAndRemoveVowel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the String");
        String str =scanner.next();

        String givenString= str.toLowerCase();
        int count =0;
        String output="";

        for( int i=0;i<=givenString.length()-1;i++)
        {
            char temp = givenString.charAt(i);

            if(temp =='a'|| temp == 'e'||temp== 'i'||temp=='o'||temp=='u')
            {
                count++;
                System.out.println("vowel found is "+ temp);
                continue;
            }
            output=output+temp;
        }
        System.out.println("String without vowel is " + output);
        System.out.println("Number of vowels in string "+ count);
    }
}
