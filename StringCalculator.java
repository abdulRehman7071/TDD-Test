public class StringCalculator {
    public static int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        } else {
            numbers = numbers.replace("\n", ",");
            String[] numberArray = numbers.split(",");
            int sum = 0;
            for (String number : numberArray) {
                sum += Integer.parseInt(number);
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        StringCalculator calculator = new StringCalculator();
        int result = calculator.add("1\n2,3");
        System.out.println(result); // prints 6
    }
}