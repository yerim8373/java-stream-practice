package problem.easy;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

public class Problem8 {

    /**
     * 주어진 정수 리스트에서 첫 번째로 짝수를 찾아 반환합니다.
     *
     * @param numbers 원본 정수 리스트
     * @return 첫 번째 짝수 (존재하지 않으면 Optional.empty())
     */
    public static Optional<Integer> findFirstEven(List<Integer> numbers) {
        // 여기에 코드 작성
        return numbers.stream()
                .filter(n -> n % 2 == 0)
                .findFirst();

//        return Optional.of(numbers.stream().filter(x -> x % 2 == 0).findFirst()).orElse(Optional.empty());
    }
}