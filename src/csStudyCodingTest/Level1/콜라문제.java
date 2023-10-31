package csStudyCodingTest.Level1;
/**
 a개당 b개의 콜라를 준다.
 n은 현재 가지고 있는 빈 콜라의 수이다.
 n이 2미만이면, 콜라를 받을 수 없다.
 <문제 풀이>
 n / a -> 10 * b;
 while(n < a) 조건

 **/
public class 콜라문제 {

    public int solution(int a, int b, int n) {

        int answer = 0;
        int emptyBottle = n;
        //20 8 4
        while(true){
            if(emptyBottle < a){
                break;
            }

            int recieve = emptyBottle / a * b;

            answer += recieve;
            emptyBottle = emptyBottle - (a * (emptyBottle / a)) + recieve;
        }

        return answer;
    }
}
