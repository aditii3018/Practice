import java.util.*;
class Alpha {
    void find(String str) {
        int v = 0, c = 0, d = 0, s = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                v++;
            } else if (ch >= '0' && ch <= '9') {
                d++;
            } else if (ch >= 'a' && ch <= 'z') {
                c++;
            } else if (ch != ' ') {
                s++;
            }
        }

        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
        System.out.println("Digits: " + d);
        System.out.println("Special Characters: " + s);
    }
}

public class exp1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = sc.nextLine();
        Alpha a = new Alpha();
        a.find(str);
    }
}
