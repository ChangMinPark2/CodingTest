package csStudyCodingTest.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class 전국대회선발고사 {
    public int solution(int[] rank, boolean[] attendance) {

        List<Integer> list = IntStream.range(0, rank.length)
                .filter(i -> attendance[i])
                .map(i -> rank[i])
                .sorted()
                .boxed()
                .collect(Collectors.toList());

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < 3; i++){
            for (int j = 0; j < rank.length; j++){
                if (list.get(i) == rank[j]){
                    answer.add(j);
                }
            }
        }

        return answer.get(0) * 10000 + answer.get(1) * 100 + answer.get(2);
    }
}
