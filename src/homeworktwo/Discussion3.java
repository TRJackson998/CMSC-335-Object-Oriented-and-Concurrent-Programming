/*
 * Pick an interface in the JDK, describe the method(s) that interface requires. 
 * Write a method that accepts an argument of your selected interface type, together with some test code.
 */
package homeworktwo;

import java.util.Map;
import java.util.Set;

public class Discussion3 {
    public static void printMap(Map<String, Integer> map) {
        Set<String> mapKeys = map.keySet();
        int value;
        for (String key : mapKeys) {
            value = map.get(key);
            System.out.println(key + ": " + value);
        }

    }

    public static void main(String[] args) {
        // Creating a HashMap instance to test the method
        Map<String, Integer> testMap = new java.util.HashMap<>();

        // Adding key-value pairs
        testMap.put("One", 1);
        testMap.put("Two", 2);
        testMap.put("Three", 3);

        // Displaying the map contents
        printMap(testMap);
    }
}
