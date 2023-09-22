package csStudyCodingTest.코딩테스트입문;

/**
 1. split 함수를 통해 배열에 담는다.
 2. answer에 0번째 인덱스를 담는다.
 3. 반복문 1번째 인덱스부터 시작하고, 만약 str[i]가 'Z'라면, i-1을 answer에서 뺀다. 아니라면 더한다.
 4. 리턴한다.
 **/

public class 컨트롤제트 {
    public static int solution(String s) {
        int answer = 0;
        //1
        String[] str = s.split(" ");
        //2
        answer += Integer.parseInt(str[0]);
        //3
        for(int i = 1; i < str.length; i++){
            if(str[i].equals("Z")){
                answer -= Integer.parseInt(str[i-1]);
            } else{
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String s = "1 2 Z 3";
        System.out.println(solution(s));
    }

}
