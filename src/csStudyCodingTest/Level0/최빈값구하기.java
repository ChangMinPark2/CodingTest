package csStudyCodingTest.Level0;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class 최빈값구하기 {
    public int solution(int[] array) {
        int answer = 0;
        int max = 0;

        Arrays.sort(array);
        max = array[array.length - 1];

        int count[] = new int[max + 1];
        for (int i = 0; i< array.length; i++){
            count[array[i]]++;
        }
        max = count[0];
        for (int i = 1; i < count.length; i++){
            if (max < count[i]){
                max = count[i];
                answer = i;
            } else if (max == count[i]){
                answer = -1;
            }
        }

        return answer;
    }

    public static int hash(int arr[]){
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i : arr){
            hashMap.put(i, hashMap.getOrDefault(i, 0) + 1);
        }

        int maxKey = Collections.max(hashMap.entrySet(), (o1, o2) -> o1.getValue() - o2.getValue()).getKey();
        System.out.println(maxKey);

        for (int key : hashMap.keySet()){
            if (hashMap.get(key) == hashMap.get(maxKey)){
                count++;
            }
        }

        if (count > 1){
            return -1;
        } else return maxKey;
    }

    public static void main(String[] args) {
        int[] arr = {3, 3, 2, 2, 2};
        System.out.println(hash(arr));
    }
}
