import java.util.Scanner;

public class Main201712_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i=0; i<n; i++){
            num[i] = sc.nextInt();
        }

        int min = 10000;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                int diff = Math.abs(num[i]-num[j]);
                if(diff<min)
                    min=diff;
            }
        }

        System.out.println(min);
    }
}
