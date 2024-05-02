package functional;

public class MainClass {

    public static void main(String[] args) {
        int a = 5;
        Square s = (int x)->x*x;
        int ans = s.area(a);
        System.out.println(ans);
    }
}
