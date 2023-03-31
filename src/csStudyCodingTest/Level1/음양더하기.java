package csStudyCodingTest.Level1;

public class 음양더하기 {
    public static int solution(int[] absolutes, boolean[] signs) {
        int repo = 0;
        for (int i = 0; i<absolutes.length; i++){
            if (signs[i]){
                repo += absolutes[i];
            }
            else repo -= absolutes[i];
        }

        return repo;
    }

    public static void main(String[] args) {
        int[] a = {4, 7, 12};
        boolean[] b = {true, false, true};

        System.out.println(solution(a, b));
    }
}
