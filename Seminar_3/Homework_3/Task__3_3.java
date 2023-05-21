package Seminar_3.Homework_3;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Task__3_3
 * Задан целочисленный список ArrayList. 
 * Найти минимальное, максимальное и среднее из этого списка.
 */
public class Task__3_3 {
    public static void main(String[] args) {
        ArrayList<Integer> listInt = new ArrayList<>();
        listInt.add(3);
        listInt.add(5);
        listInt.add(9);
        listInt.add(12);
        listInt.add(4);

        System.out.println(listInt);
        System.out.println("Максимальное значение: " + FindMax(listInt));
        System.out.println("Минимальное значение: " + FindMin(listInt));
        System.out.println("Среднее значение: " + FindAVG(listInt));
    }

    public static int FindMax(ArrayList<Integer> listInt) {
        Iterator<Integer> iterator = listInt.iterator();
        int maxNum = listInt.get(0);

        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element > maxNum) {
                maxNum = element;
            }
        }

        return maxNum;
    }

    public static int FindMin(ArrayList<Integer> listInt) {
        Iterator<Integer> iterator = listInt.iterator();
        int minNum = listInt.get(0);

        while (iterator.hasNext()) {
            int element = iterator.next();
            if (element < minNum) {
                minNum = element;
            }
        }

        return minNum;
    }


    public static double FindAVG(ArrayList<Integer> listInt) {
        Iterator<Integer> iterator = listInt.iterator();
        double listAVG = 0.0;

        while (iterator.hasNext()) {
            listAVG += iterator.next();
        }

        return listAVG / listInt.size();
    }
    
}
