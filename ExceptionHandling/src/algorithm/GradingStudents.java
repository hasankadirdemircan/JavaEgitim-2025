package algorithm;

public class GradingStudents {

    public static void main(String[] args) {
        int grade = 73;

        int newGrade = gradingStudents(grade);

        System.out.println("new grade : "  + newGrade);
    }

    public static int gradingStudents(int grade) {
        if(grade < 38) {
            return grade;
        }

        int nextMultipleFive = ((grade / 5) + 1) * 5;
        if (nextMultipleFive - grade < 3) {
            return nextMultipleFive;
        } else {
            return grade;
        }

    }
}
