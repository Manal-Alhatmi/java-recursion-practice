public class PowerCalculator {

    public static void main(String[] args) {
        int base = 3;
        int exponent = 4;
        long result = 1;

        System.out.println("Calculating " + base + "^" + exponent + " using a loop...");

        result = powerRecursive(base, exponent);

        System.out.println("Result: " + result);
    }

    public static long powerRecursive(int base, int exp){
        if(exp == 0)
            return 1;
            else
                return base * powerRecursive(base, exp-1);
    }
}
