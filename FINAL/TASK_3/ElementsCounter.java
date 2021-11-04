/*
Author: Zakrewski
Date: 28.10.2021
*/

import java.util.*;

public class ElementsCounter {
    public static HashMap<Object, Integer> countElements(List<?> array) {
        HashMap<Object, Integer> map = new HashMap<>();
        int counter;

        while(array.size() > 0) {
            counter = 0;
            Object reference = array.get(0);
            for(Object item : array) {
                if(reference.equals(item)) ++counter;
            }
            map.put(reference, counter);
            while(array.contains(reference)) {
                array.remove(reference);
            }
        }

        return map;
    }


}
