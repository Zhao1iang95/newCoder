package leetCodeGroup.greedy;

import java.util.Arrays;

/**
 * @author : zhaoliang
 * @program :newCoder
 * @description : 分发饼干
 * @create : 2020/08/19 08:59
 */
public class LeetCode455 {
    //假设你是一位很棒的家长，想要给你的孩子们一些小饼干。
    // 但是，每个孩子最多只能给一块饼干。对每个孩子 i ，都有一个胃口值 gi ，
    // 这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j ，都有一个尺寸 sj 。
    // 如果 sj >= gi ，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
    //你可以假设胃口值为正。
    //一个小朋友最多只能拥有一块饼干。
    public int findContentChildren(int[] grid,int[] size){
        //给一个孩子的饼干应当尽量小并且又能满足该孩子，这样大饼干才能拿来给满足度比较大的孩子。
        //因为满足度最小的孩子最容易得到满足，所以先满足满足度最小的孩子。
        if(grid == null || size==null)return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
        int gi=0,sj=0;
        while (gi<grid.length && sj<grid.length){
            if(grid[gi]<=size[sj]){
                gi++;
            }
            sj++;
        }
        return gi;
    }
}
