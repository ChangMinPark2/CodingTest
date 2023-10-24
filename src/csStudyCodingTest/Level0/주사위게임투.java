package csStudyCodingTest.Level0;

public class 주사위게임투 {
    public int solution(int a, int b, int c) {
        double answer = 0;
        if(a !=b && b !=c && a != c){
            answer = a + b + c;
        } else if(a == b && b != c){
            answer = (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else if(a == c && b != c){
            answer = (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else if(b == c && b != a){
            answer = (a + b + c) * (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));
        } else if(a == b && b == c){
            answer = (a + b + c) *
                    (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))*(Math.pow(a, 3) + Math.pow(b, 3) + Math.pow(c, 3));
        }
        return (int)answer;
    }
}
