package csStudyCodingTest.Level1;

//나머지가 1인 숫자 중에서 가장 작은 숫자.
public class 나머지가1이되는수찾기 {
    public static int solution(int n){
            for(int i=1; i<n; i++)
                if(n%i == 1)
                    return i;

            return 0;
    }

    public static void main(String[] args) {
        System.out.println(solution(10));
    }
}
