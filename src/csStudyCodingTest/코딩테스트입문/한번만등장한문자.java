package csStudyCodingTest.코딩테스트입문;

import java.util.Arrays;
import java.util.HashMap;

public class 한번만등장한문자 {
    public static String solution(String s) {

        StringBuilder sb = new StringBuilder();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++){
            hashMap.put(s.charAt(i), hashMap.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (char key : hashMap.keySet()){
            if (hashMap.get(key) == 1){
                sb.append(String.valueOf(key));
            }
        }

        char[] a = sb.toString().toCharArray();

        Arrays.sort(a);

        return new String(a);
    }

    public static void main(String[] args) {
        String a = "dcab";
        System.out.println(solution(a));
    }
}
