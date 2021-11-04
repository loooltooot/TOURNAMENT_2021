/*
Author: Zakrewski
Date: 28.10.2021
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTask implements Runnable {
    private ExampleValue val;
    private int id;

    MyTask(int id, ExampleValue val) {
        this.val = val;
        this.id = id;
    }

    @Override
    public void run() {
        synchronized(val) {
            val.num = 1;
            for(int i = 0; i < 10; i++) {
                System.out.printf("Я работаю №%d %d\n", id, val.num);
                val.num++;
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
