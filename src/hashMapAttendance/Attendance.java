package hashMapAttendance;

import java.util.*;


public class Attendance {
    public static void main(String[] args) {

        Map<String, String> creds = new HashMap<>();

        creds.put("Tom", "Present");
        creds.put("Peter", "absent");
        creds.put("Sam", "Present");
        creds.put("Potter", "absent");

        System.out.println(creds.get("Sam"));

        for (Map.Entry<String, String> e : creds.entrySet()) {
            System.out.println("Name of the Student :" +e.getKey());
            System.out.println("Attendance of the Student :" +e.getValue());
        }

        String value = creds.replace("Peter", "Present");
        String value1 = creds.replace("Potter", "Present");
        System.out.println("Replaced Value: " + value);
        System.out.println("Updated HashMap: " + creds);
    }
}
