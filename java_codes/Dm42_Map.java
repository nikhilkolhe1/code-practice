import java.util.HashMap;
import java.util.Map;

public class Dm42_Map {
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Harshs", 30);
        students.put("navin", 33);
        students.put("nikhil", 40);
        students.put("Harsh", 60);
        students.put("priy", 70);

        System.out.println(students.get("Harshs"));


    }
}
