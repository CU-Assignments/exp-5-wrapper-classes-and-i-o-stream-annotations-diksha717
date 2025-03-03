import java.util.*;
public class Main {
    public static void main(String[] args) {
        String[] Numbers = {"10", "20", "30", "40", "50"};
        List<Integer> numberslist = new ArrayList<>();
        for (String str : Numbers) {
            numbers.add(Integer.parseInt(str));
        }
        int sum = 0;
        for (Integer num : numberslist) {
            sum += num;
        }
        System.out.println("Sum of numbers: " + sum);
    }
}
