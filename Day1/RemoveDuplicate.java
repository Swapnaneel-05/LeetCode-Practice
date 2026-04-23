public class RemoveDuplicate {

    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int unique = 1;

        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[unique - 1]) {
                nums[unique] = nums[j];
                unique++;
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();

        int[] nums = {1, 1, 2, 2, 3};

        int k = obj.removeDuplicates(nums);

        System.out.println("Unique count: " + k);
        System.out.print("Array after removing duplicates: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}