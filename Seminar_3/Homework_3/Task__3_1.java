// Реализовать алгоритм сортировки слиянием

package Seminar_3.Homework_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task__3_1 {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 10;
        int min = -4;
        int max = 10;

        List<Integer> list1 = CreateList(count, min, max, random);

        System.out.println("Исходный массив:");
        System.out.println(list1);

        List<Integer> sortedList = MergeSort(list1); 

        System.out.println("Отсортированный список:");
        System.out.println(sortedList);

    }

    public static List<Integer> CreateList(int count, int min, int max, Random random) {

        List<Integer> createdList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            createdList.add(random.nextInt((max - min) + 1) + min);
        }
        return createdList;
    }
    
    public static List<Integer> MergeSort(List<Integer> listArray) {
        if (listArray == null) {
            return null;
        }
        if (listArray.size() < 2) {
            return listArray;
        }

        int middle = listArray.size() / 2;
        List<Integer> leftList = listArray.subList(0, middle);
        List<Integer> rightList = listArray.subList(middle, listArray.size());

        leftList = MergeSort(leftList);
        rightList = MergeSort(rightList);

        return Merge(leftList, rightList);
    }

    private static List<Integer> Merge(List<Integer> leftList, List<Integer> rightList) {
        List<Integer> mergedList = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;

        while (leftIndex < leftList.size() && rightIndex < rightList.size()) {
            if (leftList.get(leftIndex) <= rightList.get(rightIndex)) {
                mergedList.add(leftList.get(leftIndex));
                leftIndex++;
            } else {
                mergedList.add(rightList.get(rightIndex));
                rightIndex++;                
            }
        }

        while (leftIndex < leftList.size()) {
            mergedList.add(leftList.get(leftIndex));
            leftIndex++;
        }

        while (rightIndex < rightList.size()) {
            mergedList.add(rightList.get(rightIndex));
            rightIndex++;
        }

        return mergedList;     
    }
}
