//wap to remove all spaces from string
import java.util.*;

class RemoveSpaces {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                result = result + s.charAt(i);
            }
        }
        System.out.println(result);

    }
}
