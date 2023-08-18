package service.impl;

import service.SearchService;

public class ILinearSearchAlgorithm implements SearchService {
    @Override
    public int search(int[] input, int targetElement) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == targetElement) {
                return i;

            }
        }
        return -1;
    }
}
