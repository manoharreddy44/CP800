import java.util.Arrays;
import java.util.Scanner;

public class HalloumiBoxes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int[] copyarr = Arrays.copyOf(arr, n);
            Arrays.sort(copyarr);

            if(Arrays.equals(copyarr, arr)){
                System.out.println("YES");
            }else if(k > 1){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
