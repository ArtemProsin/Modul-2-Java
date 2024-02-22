package ua.prosin.modul;

import java.util.HashMap;

public class CountElements {
    public static int countUniqueElements(int[] items) {
        HashMap<Integer, Integer> uniqueElements = new HashMap();

        for (int element : items) {
            if (uniqueElements.containsKey(element)) {
                uniqueElements.put(element, uniqueElements.get(element) + 1);
            } else {
                uniqueElements.put(element, 1);
            }
        }
        int count = 0;
        for (int element : items) {
            if (uniqueElements.get(element) == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] item = {3, 4, 5, 1, 1, 4, 6, 7, 5,};
        int uniqueElementsCount = countUniqueElements(item);
        System.out.println(uniqueElementsCount);
    }
}
