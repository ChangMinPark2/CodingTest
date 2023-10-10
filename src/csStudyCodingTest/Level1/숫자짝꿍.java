package csStudyCodingTest.Level1;

import java.util.*;
import java.util.stream.*;

public class 숫자짝꿍 {
    public String solution(String X, String Y) {
        HashMap<String, Integer> xMap = new HashMap<>();
        HashMap<String, Integer> yMap = new HashMap<>();

        List<String> list = new ArrayList<>();

        for(String key: X.split("")) {
            xMap.put(key, xMap.getOrDefault(key, 0)+1);
        }

        for(String key: Y.split("")) {
            yMap.put(key, yMap.getOrDefault(key, 0)+1);
        }

        for(String key: xMap.keySet()) {
            if(!yMap.containsKey(key)) continue;

            int length = Math.min(xMap.get(key), yMap.get(key));
            for(int i = 0; i < length; i++) {
                list.add(key);
            }
        }

        String result = list.stream()
                .sorted(Collections.reverseOrder())
                .collect(Collectors.joining());

        if(result.isEmpty()) return "-1";
        if(result.replaceAll("0", "").isEmpty()) return "0";

        return result;
    }

    private boolean isZero(String a){
        for (int i = 0; i < a.length(); i++){
            if(a.charAt(i) != '0'){
                return false;
            }
        }
        return true;
    }
}
