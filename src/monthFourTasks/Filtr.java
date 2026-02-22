package monthFourTasks;

import java.util.Comparator;
import java.util.List;

public class Filtr {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3,10,15,20,7,8);
        List<Integer> result = nums.stream()
                .filter(n -> n % 2 != 0)
                .map(n -> n * 3)
                .sorted(Comparator.reverseOrder())
                .toList();

        System.out.println(result);
    }
}
