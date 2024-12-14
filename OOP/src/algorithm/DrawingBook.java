package algorithm;

public class DrawingBook {

    public static void main(String[] args) {
        int n = 5;
        int p = 4;

        System.out.println("min page : " + pageCount(n, p));
    }

    public static int pageCount(int n, int p) {

        System.out.println("from left");
        int leftPageCount = 0;
        for(int i=0; i<n; i++) {
            int pageLeft = i * 2;;
            int rightPage = pageLeft + 1;
            System.out.println("---------------------------------");
            System.out.println("i : " + i);
            System.out.println("left page : " + pageLeft);
            System.out.println("right page : " + rightPage);
            if(p == pageLeft || p == rightPage) {
                leftPageCount = i;
                break;
            }
        }

        System.out.println("from right");
        int rightPageCount = 0;

        for(int i=n/2; i>=0; i--) {
            int pageLeft = i * 2;;
            int rightPage = pageLeft + 1;
            System.out.println("---------------------------------");
            System.out.println("i : " + i);
            System.out.println("left page : " + pageLeft);
            System.out.println("right page : " + rightPage);
            if(p == pageLeft || p == rightPage) {
                rightPageCount = Math.abs(i - n/2);
                break;
            }
        }

        return Math.min(leftPageCount, rightPageCount);
    }

    public static int pageCountV2(int n, int p) {
        int total = n/2 + 1;
        int start = p/2;
        int end = total - start - 1;

        System.out.println(Math.min(start, end));
        return Math.min(start, end);
    }

}
