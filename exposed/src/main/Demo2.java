package LX;

import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("最小值是");
        if (a > b && c > b) {
            System.out.println(b);
        } else if (a < b && a < c) {
            System.out.println(a);
        } else {
            System.out.println(c);
        }
    }
}
/*public static void main(String[] args) {
        //2.创建键盘录入对象
        Scanner sc = new Scanner(System.in);
        //3.分别录入三个数字
        System.out.println("请输入第一个整数：");
        int i = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int j = sc.nextInt();
        System.out.println("请输入第三个整数：");
        int k = sc.nextInt();
        //4.定义变量代表最小值
        int min;
        //5.对三个整数进行判断
        if( i < j && i < k){
            min = i;
        }else if( j < i && j < k){
            min = j;
        }else{
            min = k;
        }
        //6.打印最小值
        System.out.println("最小值是" + min);
    }
 */