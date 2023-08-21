class Banana {
    public int minEatingSpeed(int[] piles, int h) {

        int left = 1;
        int right = piles.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canFinish(piles, h, mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;

    }

    private boolean canFinish(int[] piles, int h, int k) {
        int hours = 0;
        for (int pile : piles) {
            int pileHour = pile / k;
            hours += pileHour;
            // checks if there are any remaining bananas and increments hours if there are
            if (pile % k != 0)
                hours++;
        }

        return hours <= h;
    }

    public static void main(String[] args) throws Exception {
        BinarySearch bs = new BinarySearch();
        int[] nums = { 30, 11, 23, 4, 20 };

        int result = bs.search(nums, 5);
        System.out.println((result));
    }
}

// use binary search to find k where low end is 1 and high end is piles.max
// low is 1 because that's what the minimum could ever be

// piles[i] = piles[i] - k
// if piles[i] <= 0 then