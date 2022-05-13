package LX;

public class Demo1 {
    public static void main(String[] args) {
        int money1 = 7988-1500;
        double money2 = 7988*0.8;
        if ( money1 > money2) {
            System.out.println("不换新"+money1+"元");
        }else {
            System.out.println("换新" + money2+"元");
        }
    }
}
