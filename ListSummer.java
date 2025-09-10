import java.util.Arrays;
import java.util.List;

public class ListSummer {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
        int totalSum = 0;

        System.out.println("Calculating sum using Recursion");

        totalSum = calculateSumRecursive(numbers, 0);

        System.out.println("--------------------------");
        System.out.println("The final sum is: " + totalSum);
    }

    public static int calculateSumRecursive(List<Integer> nums, int index) {
        if ( index == nums.size())
            return 0;

        return nums.get(index)+calculateSumRecursive(nums, index+1);
    }
}