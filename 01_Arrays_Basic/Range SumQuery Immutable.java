class NumArray {
    // 1. Declare a private member variable to hold the array.
    private int[] nums;

    // 2. The constructor takes the input array and stores it in the member variable.
    public NumArray(int[] nums) {
        this.nums = nums;
    }
    
    // 3. The sumRange method calculates the sum by iterating through the stored array.
    public int sumRange(int left, int right) {
        int sum = 0;
        for (int i = left; i <= right; i++) {
            sum += this.nums[i]; // Use the stored member variable here
        }
        return sum;
    }
}
