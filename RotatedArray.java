import java.util.Arrays;

class RotatedArray {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[right] < nums[mid]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return nums[right];
    }

    public static void main(String[] args) throws Exception {
        RotatedArray ra = new RotatedArray();
        int[] nums = { 3, 4, 5, 1, 2 };

        int result = ra.findMin(nums);
        System.out.println((result));
    }
}

// Find the pivot point (e.g [4,5,6,    7,0    ,1,2])
// The number on the right of the pivot point will always be the minimum
// If you check nums[right] < nums[mid] then you know that the mid value is on the left sorted portion
// So search right portion else - search left 
