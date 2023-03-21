package csStudyCodingTest;

public class 최대최소값 {
        public static String solution(String s) {
           // s = "1 2 3 4";
            String answer = "";
            String[] repo= s.split(" ");
            int[] nums = new int[repo.length];

            for(int i = 0; i<repo.length; i++){
                nums[i] = Integer.parseInt(repo[i]);
            }


            int min = nums[0]; //1
            int max = nums[0]; //1

            for (int i = 0; i < nums.length; i++){
                if(min>nums[i]){
                    min = nums[i];
                }
                if(max<nums[i]){
                    max = nums[i];
                }
            }
            answer = min +" "+ max;

            return answer;
        }

    public static void main(String[] args) {

        solution("1 2 3 4");
        System.out.println(solution("-1 -2 -3 -4"));

    }

}
