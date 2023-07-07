package csStudyCodingTest.고득점kit_해시;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/***
 * 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 반환
 * ex, 1 -> 119, 2 -> 11912 = false
 * ex, 1 -> 12, 2 -> 34 = true
 * Set VS Map -> 키값만 필요하기 때문에 SET을 쓰면 좋겠다는 생각이 들 수 있지만, 시간효율은 MAP이 훨씬 좋다고 한다.
 * 왜 좋은지는 공부를 해봐야겠다.
 */
public class 전화번호목록 {

    public static boolean solution(String[] phone_book) {
        /***
         * HashMap의 방법
         */
        boolean answer = true;

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i=0; i<phone_book.length; i++){
            hashMap.put(phone_book[i], i);
        }

        for (int i = 0; i < phone_book.length; i++) {
            // 0번째-1번째, 1-2 순으로 비교해주기 위해 1부터 시작한다.
            for (int j = 1; j < phone_book.length; j++) {
                // i를 담은 맵의 키와 i를 0부터 j글자까지 자른 값이 있는 지 확인
                if(hashMap.containsKey(phone_book[i].substring(0,j)))
                    answer = false;
            }
        }
        return answer;
    }

    public static boolean solution2(String[] phone_book){

        /***
         * HashSet의 방법
         */
        Set<String> set = new HashSet<>();

        for (String s : phone_book){
            set.add(s);
        }

        for (String s : phone_book){
            for (int i = 1; i < s.length(); i++){
                if (set.contains(s.substring(0, i))){
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String[] a = {"12", "34", "56", "712"};

//        System.out.println(solution(a)); 문제있
        System.out.println(solution2(a));
    }
}
