/*
 *  Author: Zakrewski
 *  Date: 28.10.21
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>();
        List<String> stringArray = new ArrayList<>(Arrays.asList(
                "I", "love", "Java", "I", "am", "Java"));

        for(int i = 0; i < 10; i++) {
            array.add((int) Math.floor(Math.random() * 10));
        }

        System.out.printf("Original array: %s\n", array.toString());
        System.out.printf("Items map of array: %s\n", ElementsCounter.countElements(array));

        System.out.printf("Original array: %s\n", stringArray.toString());
        System.out.printf("Items map of array: %s\n", ElementsCounter.countElements(stringArray));
    }
}
