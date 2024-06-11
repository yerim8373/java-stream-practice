package problem.easy;

import java.util.List;
import java.util.stream.Collectors;

public class Problem5 {

    /**
     * 주어진 문자열 리스트를 하나의 문자열로 연결하여 반환합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 연결된 문자열
     */
    public static String concatenateStrings(List<String> strings) {
        // 여기에 코드 작성
//        return strings.stream()
//                .map(s -> s += s)
//                .toString();
//        return strings.stream()
//                .reduce((acc, x) -> acc + x)
//                .orElse("");
        return strings.stream()
                .collect(Collectors.joining());
    }
}