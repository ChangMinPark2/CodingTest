package csStudyCodingTest.고득점kit_해시;

import java.util.HashMap;

public class 완주하지못한선수 {
    //participant -> 마라톤에 참여한 선수 이름, 완주한 선수의 이름
    // return값 완주하지 못한 선수의 이름
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String p : participant){
            hashMap.put(p, hashMap.getOrDefault(p,0)+1);
        }

        for (String c : completion){
            hashMap.put(c,hashMap.get(c) - 1);
        }

        for (String key : hashMap.keySet()){
            if (hashMap.get(key) != 0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}
