package algorithm;

public class AngryProfessor {

    public static void main(String[] args) {
        int[] a = {-2, -1, 0, 1, 2};
        int k = 3;
        String decisionOfProfessor = angryProfessor(k, a);
        System.out.println("will the class cancel : " + decisionOfProfessor);
    }


    public static String angryProfessor(int k, int[] a) {
        int studentCountInClass = 0;

        for(int studentArriveTime : a) {
            if(studentArriveTime <= 0) {
                studentCountInClass++;
            }
        }

        if(studentCountInClass >= k) {
            return "NO"; // the class is cancelled?
        }

        return "YES";
    }
}
