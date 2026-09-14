

import java.util.HashSet;
import java.util.Set;

public class missing {
    public static void main(String[] args) {
        int num[] = { 2, 3, 4, 5, 6, 8 };
        int k = 3 ;

        Set<Integer> set = new HashSet<>();
        for (int nums : num) {
            set.add(nums);
        }

        int m = k;
        while (set.contains(m)) {
            m = m + k;
        }

        System.out.println(m); // 10
    }
}