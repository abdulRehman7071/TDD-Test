import java.util.ArrayList;
import java.util.List;

public class StringCalculator {
    public static int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        } else {
            numbers = numbers.replace("\n", ",");
            String[] numberArray = numbers.split(",");
            int sum = 0;
            List<Integer> negativeNumbers = new ArrayList<>();
            for (String number : numberArray) {
                int num = Integer.parseInt(number);
                if (num < 0) {
                    negativeNumbers.add(num);
                }
                sum += num;
            }
            if (!negativeNumbers.isEmpty()) {
                String negativeNumbersString = negativeNumbers.toString().replace("[", "").replace("]", "");
                throw new RuntimeException("Negative numbers not allowed: " + negativeNumbersString);
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        try {
            int result = calculator.add("-1,-2,3");
        } catch (RuntimeException e) {
            System.out.println(e.getMessage()); // prints "Negative numbers not allowed: -1, -2"
        }
    }
}