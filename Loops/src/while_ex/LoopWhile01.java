package while_ex;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class LoopWhile01 {
    public static void main(String[] args) {
      int start = 0, finish = 5;

      while (finish >= 0) {
          System.out.println("start : " + start + " finish : " + finish);
          start = start + 1; //start++
          finish = finish - 1; //finish--
      }


      System.out.println("for loop");
      for(int i=5; i>=0; i--) {
          System.out.println(i);
      }
    }

}