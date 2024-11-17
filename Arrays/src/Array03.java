public class Array03 {

    public static void main(String[] args) {
        int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
        int toplam = 0;
        double ortalama;
        for(int number : numbers) {
            toplam = toplam + number;
        }
        ortalama = (double)toplam / (double)numbers.length;
        System.out.println("toplam : " + toplam);
        System.out.println("ortalama : " + ortalama);

    }
}
