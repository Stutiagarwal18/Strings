import java.util.*;

class ReverseWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String words[] = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            String rev = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                rev = rev + words[i].charAt(j);
            }
            System.out.print(rev+"   ");
        }
    }
}