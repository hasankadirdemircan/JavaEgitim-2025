package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap02 {

    public static void main(String[] args) {
        Map<String, List<String>> clientRequestMap = new HashMap<>();
        List<String> requestList = new ArrayList<>();
        String client = "X";
        requestList.add("request1");
        requestList.add("request2");
        requestList.add("request3");
        requestList.add("request4");

        String client2 = "Y";
        List<String> requestListY = new ArrayList<>();
        requestListY.add("request1");
        requestListY.add("request2");
        requestListY.add("request3");
        requestListY.add("request4");

        clientRequestMap.put(client, requestList);
        clientRequestMap.put(client2, requestListY);
        System.out.println(clientRequestMap);
    }
}
