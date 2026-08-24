
//wap to print first and last character of string
import java.util.*;

class PrintChar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(s.length()-1));
    }
}