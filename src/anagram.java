import java.util.HashMap;

public class anagram {
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        if (s.length() != t.length()) {
            System.out.println("False");
            return;
        }

        // Count characters from s
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Check characters from t
        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if (!map.containsKey(ch)) {
                System.out.println("False");
                return;
            }

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            }
        }

        if (map.isEmpty()) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}