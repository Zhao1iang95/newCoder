package SFOffer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test100 {
    static Scanner scanner = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();
    static void C(int m,int n){
        int[] b = new int[n];

        for(int i=m;i<=n;i++) {
            b[m-1] = i-1;
            if(m>1) {
                C(i - 1, m - 1);
            }else {
                list.add(i);
            }
        }
    }

    public static void main(String[] args) {
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        C(m,n);
        System.out.println(list.size());
    }


}
