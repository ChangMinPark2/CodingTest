package csStudyCodingTest.Level1;
import java.util.*;
import java.util.stream.Collectors;

public class 과일장수 {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int count = score.length / m;

        List<Integer> list = Arrays.stream(score)
                .boxed()
                .collect(Collectors.toList());

        Collections.sort(list, Collections.reverseOrder());

        List<Integer> repo = new ArrayList<>();

        for(int i = 0; i < count * m; i++){
            repo.add(list.get(i));

            if (repo.size() == m){
                Collections.sort(repo);
                answer += repo.get(0) * m;
                repo.clear();
            }

        }

        return answer;
    }

    public int solution2(int k, int m, int[] score) {
        int answer = 0;

        Arrays.sort(score);

        for(int i = score.length; i >= m; i -= m){
            answer += score[i - m] * m;
        }

        return answer;
    }
}
