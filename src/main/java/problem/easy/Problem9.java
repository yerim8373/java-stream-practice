package problem.easy;

import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Problem9 {

    /**
     * 주어진 문자열 리스트의 각 문자열에 대해 길이가 3보다 크면 대문자로 변환하고, 그렇지 않으면 그대로 두는 새로운 리스트를 반환합니다.
     *
     * @param strings 원본 문자열 리스트
     * @return 변환된 문자열 리스트
     */
    public static List<String> transformStrings(List<String> strings) {
        // 여기에 코드 작성
        return strings.stream()
                .map(s -> {
                    return s.length() > 3 ? s.toUpperCase() : s;
//                    if(s.length() > 3){
//                        return s.toUpperCase();
//                    } else {
//                        return s;
//                    }
                })
                .collect(Collectors.toList());
    }
}