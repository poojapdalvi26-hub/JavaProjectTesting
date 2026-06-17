package exception;

import java.sql.SQLOutput;

public class Eg4 {
    public static void main(String[] args) {
        String d="testing";
     //   System.out.println(d.substring(0,4));
        try
        {
            System.out.println(d.charAt(9));
        }
      /*  catch (NullPointerException e) {
            System.out.println("can not assign null value to the variable");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("check String index");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }*/
        finally {
            System.out.println("Finally executed");
        }

        System.out.println("Bye");
    }
}
