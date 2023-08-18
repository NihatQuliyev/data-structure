package service;

public interface SortAlgorithm {
    void sort(int[] input);
    default void show(int[] input) {
        System.out.print("[");
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
            if (i != input.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
