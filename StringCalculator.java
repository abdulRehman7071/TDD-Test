public class StringCalculator {
    public static int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        } else {
            return Integer.parseInt(numbers);
        }
    }

    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("");
        System.out.println(result);
    }
}