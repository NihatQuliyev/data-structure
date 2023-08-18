package service.impl;

import service.SearchService;

public class IBinarySearchAlgorithm implements SearchService {
    @Override
    public int search(int[] input, int target) {

        return search(input, target, 0, input.length - 1);

    }
    private int search(int[] input, int target, int firstIndex, int lastIndex) {
        if (firstIndex > lastIndex) {
            System.out.print("Not found target element array list ");
            return -1;
        }
        int midIndex = (firstIndex + lastIndex) / 2;
        if (input[midIndex] == target) {
            System.out.print("Target element index ");
            return midIndex;
        }
        if (input[midIndex] > target) return search(input, target, firstIndex, midIndex - 1);
        if (input[midIndex] < target) return search(input, target, midIndex + 1, lastIndex);
        else {
            System.out.print("Not found target element array list: ");
            return -1;
        }
    }


}
