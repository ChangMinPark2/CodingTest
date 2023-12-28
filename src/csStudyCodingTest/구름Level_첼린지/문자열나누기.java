package csStudyCodingTest.구름Level_첼린지;
import java.io.*;


public class 문자열나누기 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String input2 = br.readLine();
        int count = 1;

        for (int i = 0; i < Integer.parseInt(input) - 1; i++){
            if (input2.charAt(i) == input2.charAt(i + 1)){
                continue;
            }
            count++;
        }
        System.out.println(count);
    }
}
