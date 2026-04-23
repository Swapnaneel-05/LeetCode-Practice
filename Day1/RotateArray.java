public class RotateArray {

    public void rotate(int[] nums, int k) {
        k = k % nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    public void reverse(int[] nums, int start, int last) {
        while (start < last) {
            int temp = nums[start];
            nums[start] = nums[last];
            nums[last] = temp;
            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        RotateArray obj = new RotateArray();

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        obj.rotate(nums, k);

        System.out.print("Rotated Array: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}