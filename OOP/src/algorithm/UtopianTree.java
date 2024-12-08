package algorithm;

public class UtopianTree {

    public static void main(String[] args) {
        int n = 4;
        int height = utopianTree(n);
        System.out.println("tree height : " + height);
    }

    public static int utopianTree(int n) {
        int total = 0;
        for(int i=0; i<=n; i++) {
           /* if(i % 2 == 0) {
                total = total + 1;
            }else {
                total = total * 2;
            }*/
            total = i % 2 == 0 ? total + 1 : total * 2;
        }
        return total;
    }
}
