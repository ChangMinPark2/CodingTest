package csStudyCodingTest.코딩테스트입문;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 옹알이일 {

    public static int solution(String[] babbling) {
        int answer = 0;

        String[] str = {"aya", "ye", "woo", "ma"};

        for(int i = 0; i < babbling.length; i++){
            for(int j = 0; j < str.length; j++){
                babbling[i] = babbling[i].replace(str[j], "1");
            }
            if (babbling[i].replaceAll("1", "2").equals("2")){
                answer++;
            }
        }
        return answer;
    }
    public static int solution2(String[] babbling) {
        int answer = 0;

        for(int i = 0; i < babbling.length; i++){
            babbling[i] = babbling[i].replace("aya", "1");
            babbling[i] = babbling[i].replace("ye", "1");
            babbling[i] = babbling[i].replace("woo", "1");
            babbling[i] = babbling[i].replace("ma", "1");
            babbling[i] = babbling[i].replace("1", "");

            if (babbling[i].isEmpty()){
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] a = {"aya", "yee", "u", "maa", "wyeoo"};
        String c = "12345";
        String d = c.replace("0", "2");
        System.out.println(d);
        System.out.println(solution2(a));
    }
}
