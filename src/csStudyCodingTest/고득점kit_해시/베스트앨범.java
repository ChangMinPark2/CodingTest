package csStudyCodingTest.고득점kit_해시;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/***
 * plays -> 노래별 재생 횟수, i는 노래의 각 고유번호.(인덱스 번호)
 * genres -> 장르
 * 베스트 엘범의 들어갈 노래의 고유 번호를 순서대로 return하기.
 * 조건 1. 속한 노래가 많이 재생된 장르부터 수록
 * 조건 2. 장르 내에서 많이 재생된 노래를 먼저 수록
 * 조건 3. 장르 내에서 재생횟수가 같은 노래는 고유 번호가 낮은 노래를 먼저 수록
 */
public class 베스트앨범 {
    public static int[] solution(String[] genres, int[] plays) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        //장르별로 총 합을 구해준다.
        for (int i=0; i< genres.length; i++){
            hashMap.put(genres[i], hashMap.getOrDefault(genres[i], 0) + plays[i]);
        }

        ArrayList<String> genre = new ArrayList<>();

        for (String key : hashMap.keySet()){
            genre.add(key);
        }

        //key값에 해당하는 value의 값을 내림차순 한다.
        Collections.sort(genre, (o1, o2) -> hashMap.get(o2) - hashMap.get(o1));
//        Collections.sort(genre, Collections.reverseOrder());

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < genre.size(); i++){
            String s = genre.get(i);

            int max = 0;
            int firstIdx = -1;

            for (int j=0; j< genres.length; j++){
                if (s.equals(genres[j]) && max < plays[j]){
                    max = plays[j];
                    firstIdx = j;
                }
            }

            max = 0;
            int secondIdx = -1;
            for (int j=0; j< genres.length; j++){
                if (s.equals(genres[j]) && max < plays[j] && j != firstIdx){
                    max = plays[j];
                    secondIdx = j;
                }
            }

            list.add(firstIdx);
            if (secondIdx >=0){
                list.add(secondIdx);
            }
        }

        int[] answer = new int[list.size()];

        for (int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        String[] genres = {"classic", "pop", "classic", "classic", "pop"};
        int[] plays = {500, 600, 150, 800, 2500};

        System.out.println(Arrays.toString(solution(genres, plays)));
    }
}
