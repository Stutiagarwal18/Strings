import java.util.*;

class Pangram {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        boolean pangram = true;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.indexOf(ch) == -1) {
                pangram = false;
                break;
            }
        }
        if (pangram) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}