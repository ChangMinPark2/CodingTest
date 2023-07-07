package csStudyCodingTest.Level0;

public class 배열의유사도 {
    /**
     * 일반적인 for문
     */

    public static int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (int i = 0; i<s1.length; i++){
            for (int j = 0; j<s2.length; j++){
                if (s1[i].equals(s2[j])) answer++;
            }
        }
        return answer;
    }
    /**
     * 향상된 for문
     */

    public int solution2(String[] s1, String[] s2) {
        int answer = 0;
        for(String str1 : s1){
            for(String str2 : s2){
                if(str1.equals(str2)){
                    answer++;
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {

    }

}
