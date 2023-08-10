class BinarySearch {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }

        return -1;
    }

    public static void main(String[] args) throws Exception {
        BinarySearch bs = new BinarySearch();
        int[] nums = { -1, 0, 3, 5, 9, 12 };

        int result = bs.search(nums, 9);
        System.out.println((result));
    }
}