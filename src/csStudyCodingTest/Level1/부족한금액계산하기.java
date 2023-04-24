package csStudyCodingTest.Level1;
//price -> 원래 이용료 n번째 이용하면 n배 추가
//3, 20, 4 -> 20리턴
//3원인 놀이기구를 4번 타고싶으면 3, 6, 9, 12 -> 30 - 20 = 10 리턴
public class 부족한금액계산하기 {
    public static long solution(int price, int money, int count) {
        long answer = 0;
        long totalPrice = 0;
        for (int i=1; i<=count; i++){
            totalPrice += price * i;
        }
        if (totalPrice < money){
            return 0;
        }

        return answer = totalPrice - money;
    }

    public static void main(String[] args) {
        System.out.println(solution(3, 20, 4));
    }
}
