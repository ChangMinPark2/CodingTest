package csStudyCodingTest.코딩테스트입문;

public class 구슬을나누는경우의수 {

    public int solution(int balls, int share) {
        return isFac(balls, share);
    }

    private int isFac(int n, int m){
        if(m == 0 || n == m){
            return 1;
        } else {
            return isFac(n - 1, m - 1) + isFac(n - 1, m);
        }
    }

    public static void main(String[] args) {
    }
}
