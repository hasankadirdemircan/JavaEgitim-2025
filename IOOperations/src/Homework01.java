import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Homework01 {
/*
5 adet öğrenci tanımlayınız, notu 50 ve 50'den yüksek olanlar için GEÇTİ,
düşük olanlar için KALDI diye dosyaya yazan java programı.
 */
    public static void main(String[] args) {
        String[] names = {"Ayşe", "Fatma", "Ali", "Ahmet", "Mehmet"};
        int[] notes = {30, 80, 50, 45, 92};

        writeStudentsNotesIntoFile(notes, names);

    }

    private static void writeStudentsNotesIntoFile(int[] notes, String[] names) {
        try(FileWriter fileWriter = new FileWriter("notes.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            String status;
            for(int i=0; i<names.length; i++) {

              /*  if(notes[i] >= 50) {
                    status = "GEÇTİ.";
                }else {
                    status = "KALDI.";
                }*/
                status = notes[i] >= 50 ?  "GEÇTİ." : "KALDI.";
                bufferedWriter.write(names[i] + "   " + notes[i] + "   : " +status);
                bufferedWriter.newLine();
            }

        }catch (IOException e) {
            System.out.println("IOException : " + e.getMessage());
        }
        System.out.println("not sonuçları dosyaya yazıldı.");
    }
}
