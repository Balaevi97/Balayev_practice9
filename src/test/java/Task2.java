import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {

        HashSet<Integer> numbers = new HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(20); // Duplicate
        numbers.add(10); // Duplicate

        System.out.println(numbers);

        if (numbers.contains(10)) {
            System.out.println("Set contains 10");
        } else {
            System.out.println("Error");
        }

        for (Integer num : numbers) {
            System.out.println(num);
        }

    }
}
