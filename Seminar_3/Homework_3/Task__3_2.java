package Seminar_3.Homework_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * Task__3_2
 * Пусть дан произвольный список целых чисел, удалить из него чётные числа
 */
public class Task__3_2 {
    
    public static void main(String[] args) {
        Random random = new Random();
        int count = 10;
        int min = -4;
        int max = 5;
        List<Integer> arrayList = new ArrayList<>(count);

        FillList(random, arrayList, count, min, max);
        System.out.println("Произвольный список целых чисел:\n" + arrayList);

        RemoveEvenNumbers(arrayList);
        System.out.println(arrayList);

    }

    public static void FillList(Random random, List<Integer> filledList, int count, int min, int max) {
        for (int i = 0; i < count; i++) {
            filledList.add(random.nextInt((max - min) + 1) + min);
        }
    }

    public static void RemoveEvenNumbers(List<Integer> editableList) {

        Iterator<Integer> col = editableList.iterator();

        while (col.hasNext()) {
            if (col.next() % 2 == 0) {
                col.remove();
            }
        }
    }
}
