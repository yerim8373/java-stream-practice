package problem.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Problem2 {

    /**
     * 주어진 정수 리스트의 각 요소를 제곱하여 새로운 리스트를 반환합니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 각 요소를 제곱한 새 리스트
     */
    public static List<Integer> squareNumbers(List<Integer> numbers) {
        return numbers.stream()
                .map(n -> n*n)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(3);
        numbers.add(5);

        System.out.println(squareNumbers(numbers).toString());
    }
}