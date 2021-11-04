import java.util.ArrayList;
import java.util.List;

/*
*  Author: Zakrewski
*  Date: 28.10.21
*/

public class Main {

    public static void main(String[] args) {
	    List<Integer> array = new ArrayList<>();
	    int randomNum = (int) Math.floor(Math.random() * 10);

	    for(int i = 0; i < 10; i++) {
	        array.add((int) Math.floor(Math.random() * 10));
        }

        System.out.printf("Original array: %s\n", array.toString());

	    while(array.contains(randomNum)) {
	        array.remove((Integer) randomNum);
        }

        System.out.printf("Array after delete '%d': %s", randomNum, array.toString());
    }
}
