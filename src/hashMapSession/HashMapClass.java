package hashMapSession;

import java.util.*;


public class HashMapClass {
    public static void main(String[] args) {
        List<String> listOfString = new ArrayList<>();
        listOfString.add("hello");

        Map<Integer, String> creds = new HashMap<>();
        creds.put(1234, "hadsjf");
        creds.put(7534, "qwassxbc");
        creds.put(8734, "lkjhgfd");
        creds.put(1974, "mnbvfds");
        creds.putIfAbsent(1974, "mnuytresdfghj");

        System.out.println(creds.get(1974));

        for (Map.Entry<Integer, String> e : creds.entrySet()) {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
    }
}




