package LogicalProgramming;

import java.util.Scanner;

public class ReverseOddPlacecsFromString {
    public static void main(String[] args) {
       String str ="Java Selenium Velocity Testing";

      // Scanner scanner = new Scanner(System.in);
        //System.out.println("Enter the String");
        //String  str=scanner.next();

        String[] str1=str.split(" ");
        String rev="";
        for(int i=0;i<=str1.length-1;i++)
        {
          if(i % 2!=0)
          {
              String temp= str1[i];
              for(int j=temp.length()-1;j>=0;j--)
              {
                  rev= rev + temp.charAt(j);
              }
              str1[i]=rev;
              rev="";
          }
        }
        for(int i=0;i<=str1.length-1;i++)
        {
            System.out.print(str1[i]+" ");
        }
    }
}
