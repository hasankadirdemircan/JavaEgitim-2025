package algorithm;

public class Kangaroos {

    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 2;

        int x2 = 5;
        int v2 = 3;
        String result = kangaroo(x1, v1, x2, v2);
        System.out.println("Result : " + result);
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if(v1 == v2) {
            if(x1 == x2) {
                return "YES";
            }else {
                return "NO";
            }
        }

        if ((x2 - x1) % (v1 - v2) == 0 && (x2 - x1) * (v1 - v2) > 0) {
            return "YES";
        }else {
            return "NO";
        }

    }
}
