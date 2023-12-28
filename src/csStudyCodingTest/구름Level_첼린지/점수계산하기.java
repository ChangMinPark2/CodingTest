package csStudyCodingTest.구름Level_첼린지;
import java.io.*;

public class 점수계산하기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();

        String[] repo = input2.split("X");
        int count = 0;
        for(int i = 0; i < repo.length; i++){
            count += fac(repo[i].length());
        }


        System.out.println(count);

    }

    private static int fac(int n){
        int answer = 0;

        for(int i = n; i > 0; i--){
            answer += i;
        }
        return answer;
    }
}
