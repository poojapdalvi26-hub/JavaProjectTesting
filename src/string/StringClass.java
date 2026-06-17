package string;

import com.sun.security.jgss.GSSUtil;

import javax.sound.midi.Soundbank;

public class StringClass {
    public static void main(String[] args) {

        String s1= "s1";
        String s2= "s1";
        String s3 ="s3";
        String s4 = new String("s1");
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s1.equals(s4));
        System.out.println("============================");
        String s5= "";
        String s6= "    ";
        System.out.println(s5.isEmpty());
        System.out.println(s6.isEmpty());
        System.out.println(s6.isBlank());
        System.out.println(s5.isBlank());
        System.out.println(s3.length());
        System.out.println("===========");
        String c1 = "Pune";
        String c2 = "Pune";
        String c3 = new String("Pune");
        String c4 = new String("Pune");
//        System.out.println(c1.equals(c2));
//        System.out.println(c1.equalsIgnoreCase(c2));


        System.out.println(c1 == c4);
        System.out.println(c1 == c2);
        System.out.println(c3 == c4);
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c3.equals(c4));


    }
}
