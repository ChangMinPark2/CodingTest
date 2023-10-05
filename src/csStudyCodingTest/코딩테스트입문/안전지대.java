package csStudyCodingTest.코딩테스트입문;

/**
 지뢰 2,2  -> {2,[0 0 1 0 0]}
 위험 지역 -> {2, 2++} {2, 2--} {2, 2}
 {2--, 2--} {2--, 2} {2--, 2++}
 {2++, 2--} {2++, 2} {2++, 2++};
 <나의 풀이>
 1. 이중반복문을 돌려서 1의 위치를 찾아낸다. -> 1의 갯수가 몇갠지 모르므로 리스트?
 2. 위의 공식을 토대로 함수를 만들어서 배열 or 리스트에 저장하고 길이 - dan을 리턴.
 **/

public class 안전지대 {

    public int solution(int[][] board) {
        int[][] dangerous = new int[board.length][board[0].length];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == 1) checkExplosion(i, j, dangerous);
            }
        }

        int count = 0;

        for(int[] arr : dangerous){
            for(int value : arr){
                if(value == 0) count++;
            }
        }

        return count;
    }

    private void checkExplosion(int x, int y, int[][] boomBoard) {
        int explosionX;
        int explosionY;

        int[] aroundX = {0, -1, -1, -1, 0, 0, 1, 1, 1};
        int[] aroundY = {0, -1, 0, 1, -1, 1, -1, 0, 1};

        for (int i = 0; i < 9; i++) {
            explosionX = x + aroundX[i];
            explosionY = y + aroundY[i];
            if (explosionX < boomBoard.length && explosionY < boomBoard.length)
                if (explosionX >= 0 && explosionY >= 0) boomBoard[explosionX][explosionY] = 1;
        }
    }

    public static void main(String[] args) {
        int[][] inArr = {{1, 1, 1, 1, 1}, {2, 2, 2, 2, 2},{2, 2, 2, 2, 2},{2, 2, 2, 2, 2},{2, 2, 2, 2, 2}};
        System.out.println(inArr.length);
    }
}
