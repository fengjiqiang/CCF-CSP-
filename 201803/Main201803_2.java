import java.util.Scanner;

//创建小球类
class Ball{
    //设置为true表示方向向右
    boolean side = true;
    //定义小球的坐标
    int point = 0;
    //方向的改变
    public void changeSide() {
        if(this.side) {
            this.side = false;
        }else {
            this.side = true;
        }
    }
    //碰到墙的情况,L表示整个坐标轴长度
    public void pWall(int L) {
        if(this.point == L || this.point == 0)
            changeSide();
    }
}

public class Main201803_2 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int L = scanner.nextInt();
        int t = scanner.nextInt();
        Ball[] balls = new Ball[n];
        int i;
        //获取初始坐标
        for(i = 0; i < n; i++) {
            balls[i] = new Ball();
            balls[i].point = scanner.nextInt();
        }
        //一开始就要运动了1s，所以用--t
        while(--t > -1) {
            //小球向右运动+1,向左运动-1
            for(i = 0; i < n; i++) {
                if(balls[i].side)
                    balls[i].point++;
                else
                    balls[i].point--;
                //运动一秒后判断是否碰到墙了
                balls[i].pWall(L);
            }
            //两球相碰时方向都改变
            for(i = 0; i < n-1; i++) {
                for(int j = i + 1; j < n; j++) {
                    if(balls[i].point == balls[j].point) {
                        balls[i].changeSide();
                        balls[j].changeSide();
                    }
                }
            }
        }
        //输出最后的坐标
        for(i = 0; i < n; i++) {
            if(i == n-1)
                System.out.print(balls[i].point);
            else
                System.out.print(balls[i].point + " ");
        }
    }
}
