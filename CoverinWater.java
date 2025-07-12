import java.util.Scanner;

public class CoverinWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- != 0){
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int cnt = 0;
            boolean continuous = false;
            for(int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                if(ch == '.'){
                    cnt++;
                }
                if(i > 1) {
                    if(s.charAt(i-2) == '.' && s.charAt(i-1) == '.' && s.charAt(i) == '.'){
                        continuous  = true;
                        break;
                    }
                }
            }
            if(continuous){
                System.out.println(2);
            } else{
                System.out.println(cnt);
            }
        }
    }
}
