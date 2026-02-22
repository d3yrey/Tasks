package monthFourTasks;

import java.util.List;

public class EasyTask {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,4,5);
        List<Integer> result = nums.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(result);
    }
}
