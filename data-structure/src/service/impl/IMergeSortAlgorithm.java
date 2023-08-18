package service.impl;

import service.SortAlgorithm;

public class IMergeSortAlgorithm implements SortAlgorithm {
    @Override
    public void sort(int[] input) {
        int length = input.length;
        int midIndex = length / 2;

        if (input.length < 2) {
            return;
        }
        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[length - midIndex];
        for (int i = 0; i < leftHalf.length; i++) {
            leftHalf[i] = input[i];
        }



        for (int i = 0; i < rightHalf.length; i++) {
            rightHalf[i] = input[i + midIndex];
        }


        sort(leftHalf);
        sort(rightHalf);


        merge(input, leftHalf, rightHalf);

    }

    public void merge(int[] input, int[] leftHalf, int[] rightHalf) {
        int leftIndexLength = leftHalf.length;
        int rightIndexLength = rightHalf.length;
        int i = 0, j = 0, k = 0;
        while (i < leftIndexLength && j < rightIndexLength) {
            if (leftHalf[i] < rightHalf[j]) {
                input[k++] = leftHalf[i++];
            } else {
                input[k++] = rightHalf[j++];
            }
        }
        while (i < leftIndexLength) {
            input[k++] = leftHalf[i++];
        }
        while (j < rightIndexLength) {
            input[k++] = rightHalf[j++];
        }
    }
}
