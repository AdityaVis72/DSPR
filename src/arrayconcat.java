public class arrayconcat {
    public static void main(String[] args) {

        int[] nums = {1, 2, 4};

        // Create an array with double the size
        int[] ans = new int[nums.length * 2];

        // Copy elements twice
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

        // Print the result
        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}