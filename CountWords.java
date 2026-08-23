import java.util.*;

class CountWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a sentence");
        String s = sc.nextLine();
        String words[] = s.trim().split(" ");
        System.out.println(words.length);

    }
}

