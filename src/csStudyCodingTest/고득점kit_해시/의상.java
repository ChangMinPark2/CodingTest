package csStudyCodingTest.고득점kit_해시;

import java.util.HashMap;

/***
 * [의상의 이름] [의상의 종류]
 * 이름은 중복 X 의상의 수 1~30
 * 모든 원소는 문자열
 */
public class 의상 {
    public static int solution(String[][] clothes) {
        int answer = 1;
        //1. 옷을 종류별로 구분한다.
        HashMap<String, Integer> hashMap = new HashMap<>();
        for(int i=0; i<clothes.length; i++){
            String cloth_type = clothes[i][1];
            hashMap.put(cloth_type, hashMap.getOrDefault(cloth_type, 1) + 1);
        }

        //2. 입지 않는 경우를 추가해서 모든 조합을 계산한다.
        for (String key : hashMap.keySet()){
            answer *= hashMap.get(key);
        }
        //3. 아무종류의 옷도 입지 않는 경우 제외한다.
        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        System.out.println(solution(clothes));

    }

}
