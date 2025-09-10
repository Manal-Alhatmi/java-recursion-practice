public class MaxFinder {
    public static void main(String[] args) {
        int[] numbers = {45, 12, 89, 6, 23, 99, 34};
        int max = Integer.MIN_VALUE;
        System.out.println("Finding the maximum number with a loop...");

        max = findMaxRecursive(numbers, 0);

        System.out.println("The maximum number is: " + max);
        }

        public static int findMaxRecursive(int[] nums, int index){
        if (index == nums.length-1)
            return nums[index];
        return Math.max(nums[index], findMaxRecursive(nums, index+1));
    }
}
