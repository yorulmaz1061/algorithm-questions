package someStream;

import java.util.Arrays;

import java.util.Comparator;


public class StreamSorted {
    public static void main(String[] args) {
        int[] arr1 = {2, 12, 456, 54753, 2346, 32221, 5665, 222};
        Integer[] arr2 = Arrays.stream(arr1).boxed().toArray(Integer[]::new);

        Arrays.sort(arr2, new RevesedOrder());
        System.out.println(Arrays.toString(arr2));
    }
    public static class RevesedOrder implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    }
}
