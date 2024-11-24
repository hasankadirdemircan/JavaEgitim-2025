package algorithm;

public class BillDivision {

    public static void main(String[] args) {
        int[] bill = {3, 10, 2, 9};
        int k = 1;
        int b = 7;
        bonAppetit(bill, k, b);
    }

    public static void bonAppetit(int[] bill, int k, int b) {
        int sumOfMeal = 0;
        for(int i=0; i<bill.length; i++) {
            if(k != i) {
                sumOfMeal = sumOfMeal + bill[i];
            }
        }
        System.out.println("sumOfAnna : " + sumOfMeal);
        int annaShouldPay = sumOfMeal / 2;

        if(annaShouldPay == b) {
            System.out.println("Bon Apatite");
        }else {
            System.out.println(b - annaShouldPay);
        }
    }
}
