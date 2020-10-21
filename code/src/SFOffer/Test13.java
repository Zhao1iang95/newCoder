package SFOffer;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 机器人的运动范围
 * @create : 2020/09/23 08:34
 */
public class Test13 {
    private static final int[][] next = {{0,1},{0,-1},{1,0},{-1,0}};
    private int rows;
    private int cols;
    private int count;
    private int  threshold;
    private int[][] digitSum;
    public int movingCount(int threshold,int rows,int cols){
        this.rows = rows;
        this.cols = cols;
        this.threshold = threshold;
        intDigitSum();
        boolean[][]marked = new boolean[rows][cols];
        dfs(marked,0,0);
        return count;
    }

    private void dfs(boolean[][] marked, int r, int c) {
        if (r<0 || r>=rows || c <0 || c>=cols || marked[r][c]){
            return;
        }
        marked[r][c] = true;
        if (this.digitSum[r][c] > this.threshold){
            return;
        }
        count++;
        for(int[] n:next){
            dfs(marked,r+n[0],c+n[1]);
        }
    }

    private void intDigitSum() {
        int [] digitSumOne = new int[Math.max(rows,cols)];
        for (int i = 0; i <digitSumOne.length ; i++) {
            int n = i;
            while(n >0){
                digitSumOne[i]+=n%10;
                n/=10;
            }
        }
        this.digitSum = new int[rows][cols];
        for (int i = 0; i <this.rows ; i++) {
            for (int j = 0; j <this.cols ; j++) {
                digitSum[i][j] = digitSumOne[i]+digitSumOne[j];
            }
        }
    }
}
