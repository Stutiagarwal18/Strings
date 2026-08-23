import java.util.*;

class Anagram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first string");
        String s1 = sc.next();
        System.out.println("enter second string");
        String s2 = sc.next();
        char a[] = s1.toCharArray();
        char b[] = s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if (Arrays.equals(a, b)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not a anagram");
        }
    }
}
