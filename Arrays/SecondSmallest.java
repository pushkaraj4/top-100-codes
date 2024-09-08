package Arrays;

public class SecondSmallest {
    public static void main(String[] args) {
        int[] array = {28, 6, 4, 2, 3, 24};
        
        int ans = secondSmallestSorting(array);
        int ans2 = secondSmallestTwopass(array);
        int ans3 = secondSmallestOnepass(array);
        
        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }
    
    static int secondSmallestTwopass(int array[]) {
        int second_smallest = Integer.MAX_VALUE;
        int smallest = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] != smallest && array[i] < second_smallest) {
                second_smallest = array[i];
            }
        }
        return second_smallest;
    }

    static int secondSmallestSorting(int array[]) {
        for (int i = 0; i < array.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minPos] > array[j]) {
                    minPos = j;
                }
            }
            int temp = array[minPos];
            array[minPos] = array[i];
            array[i] = temp;
            if (i == 1) return array[i];
        }
        return -1;
    }

    static int secondSmallestOnepass(int[] array) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < first) {
                second = first;
                first = array[i];
            }
            else if (array[i] < second && second != first) {
                second = array[i];
            }
        }
        return second;
    }
}
