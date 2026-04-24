package Day2;

public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] == val) {
                nums[l] = nums[r];
                r--;
            } else {
                l++;
            }
        }

        return l;
    }

    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();

        int[] nums = {3, 2, 2, 3};
        int val = 3;

        int k = obj.removeElement(nums, val);

        System.out.println("New length: " + k);
        System.out.print("Array after removal: ");

        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
