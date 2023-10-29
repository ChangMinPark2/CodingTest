package csStudyCodingTest.Level1;
/**
 포토 중첩 반복문 돌려서 j가 name이랑 같다면, yearning[j]를 더한다.
 **/

public class 추억점수 {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] answer = new int[photo.length];

        for(int i = 0; i < photo.length; i++){
            for(int j = 0; j < photo[i].length; j++){
                for(int z = 0; z < name.length; z++){
                    if(photo[i][j].equals(name[z])){
                        answer[i] += yearning[z];
                    }
                }
            }
        }
        return answer;
    }
}
