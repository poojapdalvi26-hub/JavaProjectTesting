package LogicalProgramming;

import javax.swing.*;

public class FindDuplicateElementInStringArray {
    public static void main(String[] args) {
        String arr[]={"api", "sql", "java", "api", "java", "selenium"};

        int count=0;
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=i+1;j<=arr.length-1;j++)
            {
                if(arr[i].equals(arr[j]))
                {
                    System.out.println("Duplicate found " +arr[i]);
                    count++;
                }
            }
        }
        System.out.println("Total duplicate found are "+ count);
    }
}
