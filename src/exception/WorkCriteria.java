package exception;

import java.sql.SQLOutput;

public class WorkCriteria {
    public static void main(String[] args) {

        int age =67;
        if(age > 60)
        {
            throw new SeniorCitizenException("Senior Citizens are not allowed to do work");
        }
        else
        {
            System.out.println("You are allowed to do work");
        }
    }
}
