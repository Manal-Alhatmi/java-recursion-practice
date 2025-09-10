import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputCollector {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> allergies = new ArrayList<>();

        System.out.println("Enter allergies one by one. Press 'q' to quit.");

        allergies = collectInputsRecursive(scanner, allergies);

        System.out.println("\n--- Collected Allergies ---");

        for (String allergy : allergies) {
            System.out.println("- " + allergy);
        }
        scanner.close();
    }

    public static List<String> collectInputsRecursive(Scanner sc, List<String> currentList) {
        System.out.print("Enter allergy: ");

        String input = sc.nextLine();

        if ("q".equalsIgnoreCase(input))
            return currentList;

        if (!"q".equalsIgnoreCase(input) && !input.isEmpty()) {
            currentList.add(input);
        }

        return collectInputsRecursive(sc, currentList);
    }
}