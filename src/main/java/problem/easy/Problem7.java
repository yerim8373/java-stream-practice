package problem.easy;

import java.util.List;
import java.util.stream.Collectors;

public class Problem7 {

    /**
     * 주어진 문자열 리스트를 알파벳 순으로 정렬하여 반환합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 알파벳 순으로 정렬된 문자열 리스트
     */
    public static List<String> sortStrings(List<String> strings) {
        // 여기에 코드 작성
        return strings.stream()
                .sorted()
                .collect(Collectors.toList());
    }
}