import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class dublicate {
    static void main() {

        int[] nums = {1, 2, 3, 1};

        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                System.out.println(true);
                return;
            }
            set.add(num);
        }

        System.out.println(false);

    }
}
