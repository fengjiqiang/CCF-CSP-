import java.util.*;

public class Main201803_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int doubleKill = 0; // 跳到中心，中心累加分
        int sum = 0; //总得分
        int number = 0;  // 输入数字0/1/2
        while((number=sc.nextInt())!=0){ //对象调用nextInt()方法
            //  nextInt()方法会读取下一个int型标志的token.但是焦点不会移动到下一行，仍然处在这一行上。
            if (number == 1){
                sum += 1;
                doubleKill = 0; //遇 1 则 中心累加分 归于 0
            }
            else if(number == 2){
                doubleKill += 2;
                sum += doubleKill;
            }
            else if(number == 0){
                break;
            }
        }
        System.out.println(sum);
    }
}
