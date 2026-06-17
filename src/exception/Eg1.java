package exception;

public class Eg1 {
    public static void main(String[] args) {

       int a;
        try {
             a = 10 / 0;
        }catch (Exception e)
        {
            System.out.println("can not divide by zero");
        }
       //System.out.println(a);
        System.out.println("Bye");
    }
}
