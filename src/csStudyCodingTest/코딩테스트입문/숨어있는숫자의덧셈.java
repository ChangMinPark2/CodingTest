package csStudyCodingTest.코딩테스트입문;

public class 숨어있는숫자의덧셈 {
    public static int solution(String my_string) {
        int answer = 0;
        String[] ms = my_string.split("[a-zA-Z]");

        for(int i = 0; i < ms.length; i++){
            System.out.println("인덱스" + i + "" + ms[i]);
        }
        for (int i = 0; i < ms.length; i++) {
            if (!ms[i].isEmpty()){{
                answer += Integer.parseInt(ms[i]);
            }}
          //  answer+= !ms[i].isEmpty() ? Integer.parseInt(ms[i]) :0;
        }

        return answer;
    }

    public static void main(String[] args) {
        String a = "aAb1B2cC34oOp";
        System.out.println(solution(a));
    }
}
