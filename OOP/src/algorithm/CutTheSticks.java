package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CutTheSticks {

    public static List<Integer> solution2(List<Integer> arr) {
        ArrayList<Integer> arrayList = new ArrayList<>(arr);

        ArrayList<Integer> sizes = new ArrayList<>();
        while(arrayList.size() != 0) {
            sizes.add(arrayList.size());
            int min = Collections.min(arrayList);
            //arrayList.removeIf(e -> e == min);
            arrayList.removeAll(Collections.singleton(min));
            for(int i=0; i< arrayList.size(); i++) {
                arrayList.set(i, arrayList.get(i) - min);
            }
        }

        return sizes;
    }

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(5, 4, 4, 2, 2, 8);
        List<Integer> arr2 = Arrays.asList(5, 4, 4, 2, 2, 8);
        List<Integer> numberOfStickList = cutTheSticks(arr);
        System.out.println("number of stick : " + numberOfStickList);

        System.out.println("solution2 : " + solution2(arr2));
    }


    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> numberOfStickList = new ArrayList<>();
       /* arr = new ArrayList<Integer>(arr);
        arr.add(0);
        arr.removeIf(x -> x == 0);*/

        for(int stick : arr) {
            int zeroCount = findZeroCount(arr);
          //  arr.removeIf(x -> x == 0);
          /*  for(int j=0; j<arr.size(); j++) {
                if(arr.get(j) == 0) {
                    arr.remove(arr.get(j));
                }
            }*/

            int size = arr.size() - zeroCount;
            if(size == 0) {
                return numberOfStickList;
            }
            Collections.sort(arr);
            int min = findMinWithoutZero(arr);
            numberOfStickList.add(size);
            for(int i=0; i<arr.size(); i++) {
                if(arr.get(i) != 0) {
                    arr.set(i, arr.get(i) - min);
                }
            }
        }

        return numberOfStickList;
    }

    private static int findZeroCount(List<Integer> arr) {
        int zeroCount = 0;
        for(int findZero : arr) {
            if(findZero == 0) {
                zeroCount++;
            }
        }
        return zeroCount;
    }

    private static int findMinWithoutZero(List<Integer> arr) {
        for(int min : arr) {
            if(min != 0) {
                return min;
            }
        }

        return arr.get(0);
    }
}
