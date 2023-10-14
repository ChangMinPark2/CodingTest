package csStudyCodingTest.Level1;

//나의 풀이,, -> List<Integer> 선언
//이중 반복문을 통해 List안의 값이, 존재하지 않는다면 합한 값을 넣는다.
import java.util.*;
public class 두개뽑아서더하기 {

    public int[] solution(int[] numbers) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(!list.contains(numbers[i] + numbers[j])){
                    list.add(numbers[i] + numbers[j]);
                }
            }
        }

        answer = list.stream()
                .sorted()
                .mapToInt(Integer::intValue)
                .toArray();

        return answer;
    }
}
