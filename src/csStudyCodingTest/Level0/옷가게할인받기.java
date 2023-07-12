package csStudyCodingTest.Level0;

public class 옷가게할인받기 {
    public static int solution(int price) {
        int answer = 0;
        if(10<=price && price <100000){
            answer = price;
        } else if (100000<= price && price < 300000){
            answer = (int)(price * 0.95);
        } else if (300000<=price && price<500000){
            answer = (int)(price * 0.9);
        } else answer = (int)(price * 0.8);

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(58000));
    }
}
