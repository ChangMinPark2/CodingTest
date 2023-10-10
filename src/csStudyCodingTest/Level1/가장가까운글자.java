package csStudyCodingTest.Level1;

/**
 banana -> -1 -1 -1 2 2 2 기준 : 이전의 같은 문자가 없으면 -1, 2의 경우 2번 째 전에 있어서 2
 <나의 풀이>
 1. char 배열로 각 문자 저장.
 2. answer 또한 char 배열의 크기로 지정.
 3. 이중 반복문 감소식을 통해서 i - j를 넣고, 없다면 -1 을 넣은다
 **/
import java.util.*;

public class 가장가까운글자 {
    public int[] solution(String s) {
        int[] answer = {};

        List<Integer> list = new ArrayList<>();

        char[] ch = s.toCharArray();

        for(int i = ch.length - 1; i >=0; i--){
            for(int j = i - 1; j >=0; j--){
                if(ch[i] == ch[j]){
                    list.add(i - j);
                    break;

                } else if(j == 0 && ch[i] != ch[j]){
                    list.add(-1);
                }
            }
        }

        list.add(-1);

        answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(list.size() - i - 1);
        }

        return answer;
    }
}
