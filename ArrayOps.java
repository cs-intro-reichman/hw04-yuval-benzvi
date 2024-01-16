public class ArrayOps {
    public static void main(String[] args) {
        int [] array = {1, 3, 2};
        //int [] array1 = {1, 2, 3};
        //int [] array2 = {1, 2, 3};
        for (int i = 0; i < array.length; i++) 
            System.out.print(array[i] + " ");
        /*for (int i = 0; i < array1.length; i++) 
            System.out.print(array1[i] + " ");
        System.out.println();       
        for (int i = 0; i < array2.length; i++) 
            System.out.print(array2[i] + " ");*/
        System.out.println();
        /*System.out.println(findMissingInt(array));
        System.out.println(secondMaxValue(array));
        System.out.print(containsTheSameElements(array1, array2));*/
        System.out.print(isSorted(array));
    }
    
    public static int findMissingInt (int [] array) {
        int missing = -1;
        int N = array.length;
        boolean found = false;
        int i = 0;
        while (i <= N && missing == -1) {
            int j = 0;
            found = false;
            while (j < N && found == false) {
                if (array[j] == i) {
                    found = true;
                    i++;
                }
                j++;
            }
            if (found == false) {
                    missing = i;
                }
        }
        if (missing == -1) {
            missing = i + 1;
        }
        return missing;
    }

    public static int secondMaxValue(int [] array) {
        int N = array.length;
        int max = array[0];
        int max_index = 0;
        int second_max = 0;
        for (int i = 1; i < N; i++) {
            if (array[i] >= max) {
                max = array[i];
                max_index = i;
            }
        }
        for (int i = 0; i < N; i++) {
            if (i != max_index)
                second_max = Math.max(second_max, array[i]);
        }
        return second_max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean equal = true;
        boolean flag = false;
        int n1 = array1.length;
        int n2 = array2.length;
        for (int i = 0; i < n1; i++) {
            flag = false;
            for (int j = 0; j < n2; j++) {
                if (array1[i] == array2[j]) {
                    flag = true;
                }
            }
            if (flag == false) 
                equal = false;
        }
        for (int i = 0; i < n2; i++) {
            flag = false;
            for (int j = 0; j < n1; j++) {
                if (array2[i] == array1[j]) {
                    flag = true;
                }
            }
            if (flag == false) 
                equal = false;
        }
        return equal;
    }

    public static boolean isSorted(int [] array) {
        boolean sorted = true;
        boolean increasing = true;
        boolean decreasing = true;
        int N = array.length;
        for (int i = 1; i < N; i++) {
            if (array[i] < array [i-1])
                increasing = false;
            if (array[i] > array [i-1])
                decreasing = false;
        }
        if (decreasing == false && increasing == false)
            sorted = false;
        return sorted;
    }

}
