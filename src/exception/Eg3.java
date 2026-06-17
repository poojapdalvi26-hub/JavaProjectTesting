package exception;

public class Eg3 {
    public static void main(String[] args) {
        String a=null;
        try {
            System.out.println(a.charAt(2));

        }

        catch (StringIndexOutOfBoundsException e){
            System.out.println("check String index");
        }
        catch (NullPointerException e) {
            System.out.println("can not assign null value to the variable");
        }
        catch (Exception e){
            System.out.println("something went wrong");
        }


        System.out.println("hello");
    }
}
