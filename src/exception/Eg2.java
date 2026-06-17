package exception;

public class Eg2 {
    public static void main(String[] args) {

        String a=null;
        try {
            System.out.println(a.charAt(2));

        } catch (ArithmeticException e) {
            System.out.println("Can not divide by 0");

        }
     //   catch (Exception e){
       //     System.out.println("something went wrong");
        //}
        catch (StringIndexOutOfBoundsException e){
            System.out.println("check String index");
        }
        catch (NullPointerException e) {
            System.out.println("can not assign null value to the variable");
        }


        System.out.println("hello");
    }
}
