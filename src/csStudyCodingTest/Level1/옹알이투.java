package csStudyCodingTest.Level1;
import java.util.*;

public class 옹알이투 {
    public int solution(String[] babbling) {
        String[] a = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < a.length; j++){
                if(babbling[i].contains("ayaaya") ||
                        babbling[i].contains("yeye") ||
                        babbling[i].contains("woowoo") ||
                        babbling[i].contains("mama")) {
                    continue;
                }
                babbling[i] = babbling[i].replace(a[j], "1");
            }
        }

        for(int i = 0; i < babbling.length; i++){
            if(babbling[i].matches("\\d+")){
                answer++;
            }
        }

        return answer;
    }
}
