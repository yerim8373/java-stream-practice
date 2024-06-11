package problem.easy;

import java.util.List;

public class Problem3 {

    /**
     * 주어진 Double 리스트의 모든 요소의 합계를 반환합니다.
     *
     * @param numbers 원본 Double 리스트
     * @return 요소들의 합계
     */
    public static double sumOfList(List<Double> numbers) {
        return numbers.stream()
                .reduce(0.0, Double::sum);

    }
}