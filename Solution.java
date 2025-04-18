package programersLV1.PCCE기출문제9번이웃한칸;

class Solution {
    static int solution(String[][] board, int h, int w) {
        int answer = 0;
        int count = 0;
        int[] dh = {0, 1, -1, 0};
        int[] dw = {1, 0, 0, -1};

        for (int i = 0; i < 4; i++) {
            int h_check = h + dh[i];
            int w_check = w + dw[i];

            if ((0 <= w_check && w_check < board[0].length) && (0 <= h_check && h_check < board.length)) {
                if (board[h][w].equals(board[h_check][w_check])) {
                    count++;
                }
            }
        }

        answer = count;
        return answer;
    }

    public static void main(String[] args) {
        String[][] board = {
            {"blue", "red", "orange", "red"},
            {"red", "red", "blue", "orange"},
            {"blue", "orange", "red", "red"},
            {"orange", "orange", "red", "blue"}
        };

        Solution solution = new Solution();
        int result = solution(board, 0, 1);

        System.out.println(result);


    }
}
