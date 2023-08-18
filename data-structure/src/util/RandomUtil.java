package util;

public class RandomUtil {
    public static int[] inputArr(int arrLength,int randomBound){
        java.util.Random random = new java.util.Random();
        int [] input = new  int[arrLength];
        for (int i = 0; i < input.length; i++) {
            input[i] = random.nextInt(randomBound);
        }
        return input;
    }
}
