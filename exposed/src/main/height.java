package LX;

import java.util.Scanner;

public class height {
 public static void main(String[] args) {
    //1.创建键盘录入Scanner类的对象
   Scanner sc = new Scanner(System.in);
    //2.获取三个int数字,代表三个和尚的身高,分别保存int变量h1,h2,h3中
    System.out.println("请输入第一个和尚的身高: ");
    int h1 = sc.nextInt();
    System.out.println("请输入第二个和尚的身高: ");
    int h2 = sc.nextInt();
    System.out.println("请输入第三个和尚的身高: ");
    int h3 = sc.nextInt();
    //3.使用三元运算符计算h1和h2的最小值,保存int变量temp中
    int temp = h1 < h2 ? h1 : h2;
    //3.使用三元运算符计算temp和h3的最小值,保存int变2量min中
    int min = temp < h3 ? temp : h3;
    //4.打印结果数据min
    System.out.println("三个和尚的最小身高: " + min);
    }
}
