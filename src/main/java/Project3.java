import java.util.Arrays;
import java.util.Random;

/**
 * Project3 is a Java program that demonstrates various sorting algorithms and performs an empirical analysis of their performance.
 * The program implements several sorting algorithms such as Insertion Sort, Bubble Sort, Selection Sort, ShellSort, MergeSort, and QuickSort.
 * It also includes a method to generate random arrays for testing purposes and performs an empirical analysis of the sorting algorithms' execution times.
 */
public class Project3 {
    /**
     * The main method is the entry point of the program. It calls the testSortingAlgorithms method and analyzes the sorting algorithms' performance for different input sizes.
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        testSortingAlgorithms();
        analyze(10);
        analyze(100);
        analyze(1000);
        analyze(10000);
        analyze(100000);
    }

    /**
     * The testSortingAlgorithms method demonstrates the usage of different sorting algorithms by sorting a predefined array of numbers and printing the results.
     */
    public static void testSortingAlgorithms() {
        int[] numbers = {5, 2, 9, 1, 7};
        System.out.println("Original List: " + Arrays.toString(numbers));

        int[] sorted = insertionSort(numbers.clone());
        System.out.println("Insertion Sort: " + Arrays.toString(sorted));

        sorted = bubbleSort(numbers.clone());
        System.out.println("Bubble Sort: " + Arrays.toString(sorted));

        sorted = selectionSort(numbers.clone());
        System.out.println("Selection Sort: " + Arrays.toString(sorted));

        sorted = shellSort(numbers.clone());
        System.out.println("Shellsort: " + Arrays.toString(sorted));

        sorted = mergeSort(numbers.clone());
        System.out.println("Mergesort: " + Arrays.toString(sorted));

        sorted = quickSort(numbers.clone());
        System.out.println("Quicksort: " + Arrays.toString(sorted) + "\n");
    }

    /**
     * The analysis method measures the execution time of each sorting algorithm for a given input size and outputs the results.
     * @param size The size of the array to analyze.
     */
    private static void analyze(int size) {
        // Generating an array of random numbers
        int[] array = generateRandomArray(size);

        // Copy the array for each sorting algorithm
        int[] copyArray1 = array.clone();
        int[] copyArray2 = array.clone();
        int[] copyArray3 = array.clone();
        int[] copyArray4 = array.clone();
        int[] copyArray5 = array.clone();
        int[] copyArray6 = array.clone();

        // Perform sorting and measure execution time for each algorithm
        long startTime = System.nanoTime();
        insertionSort(copyArray1);
        long endTime = System.nanoTime();
        long insertionSortTime = endTime - startTime;

        startTime = System.nanoTime();
        bubbleSort(copyArray2);
        endTime = System.nanoTime();
        long bubbleSortTime = endTime - startTime;

        startTime = System.nanoTime();
        selectionSort(copyArray3);
        endTime = System.nanoTime();
        long selectionSortTime = endTime - startTime;

        startTime = System.nanoTime();
        shellSort(copyArray4);
        endTime = System.nanoTime();
        long shellSortTime = endTime - startTime;

        startTime = System.nanoTime();
        mergeSort(copyArray5);
        endTime = System.nanoTime();
        long mergeSortTime = endTime - startTime;

        startTime = System.nanoTime();
        quickSort(copyArray6);
        endTime = System.nanoTime();
        long quickSortTime = endTime - startTime;

        // Output the results
        System.out.println("List of size " + size + ":");
        System.out.println("Insertion sort: " + insertionSortTime + " ns (" + (insertionSortTime / 1000000.0) + " ms)");
        System.out.println("Bubble sort: " + bubbleSortTime + " ns (" + (bubbleSortTime / 1000000.0) + " ms)");
        System.out.println("Selection sort: " + selectionSortTime + " ns (" + (selectionSortTime / 1000000.0) + " ms)");
        System.out.println("ShellSort: " + shellSortTime + " ns (" + (shellSortTime / 1000000.0) + " ms)");
        System.out.println("MergeSort: " + mergeSortTime + " ns (" + (mergeSortTime / 1000000.0) + " ms)");
        System.out.println("QuickSort: " + quickSortTime + " ns (" + (quickSortTime / 1000000.0) + " ms)\n");
    }

    /**
     * The insertionSort method sorts an array using the Insertion Sort algorithm.
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static int[] insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }

    /**
     * The bubbleSort method sorts an array using the Bubble Sort algorithm.
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static int[] bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    /**
     * The selectionSort method sorts an array using the Selection Sort algorithm.
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static int[] selectionSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex])
                    minIndex = j;
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        return array;
    }

    /**
     * The shellSort method sorts an array using the ShellSort algorithm.
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static int[] shellSort(int[] array) {
        int n = array.length;
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;
                for (j = i; j >= gap && array[j - gap] > temp; j -= gap)
                    array[j] = array[j - gap];
                array[j] = temp;
            }
        }
        return array;
    }

    /**
     * The mergeSort method sorts an array using the MergeSort algorithm.
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static int[] mergeSort(int[] array) {

        if (array.length <= 1)
            return array;

        int mid = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(array, mid, array.length));

        return merge(left, right);
    }

    /**
     * The merge method merges two sorted arrays into a single sorted array.
     * @param left The left array to merge.
     * @param right The right array to merge.
     * @return The merged array.
     */
    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                merged[k++] = left[i++];
            else
                merged[k++] = right[j++];
        }

        while (i < left.length)
            merged[k++] = left[i++];

        while (j < right.length)
            merged[k++] = right[j++];

        return merged;
    }

    /**
     * The quickSort method sorts an array using the QuickSort algorithm.
     * @param array The array to be sorted.
     * @return The sorted array.
     */
    public static int[] quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
        return array;
    }

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    /**
     * The partition method partitions an array for the QuickSort algorithm.
     * @param array The array to partition.
     * @param low The starting index of the partition.
     * @param high The ending index of the partition.
     * @return The pivot index.
     */
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j <= high - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;
        return i + 1;
    }

    /**
     * The generateRandomArray method generates an array of random integers.
     * @param size The size of the array.
     * @return The generated array.
     */
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    /*
     * Empirical Analysis:
     *
     * After running the program and analyzing the results, we can observe the following:
     *
     * - Insertion Sort and Bubble Sort have the poorest performance among the tested algorithms. They exhibit quadratic time complexity, meaning their execution time increases significantly as the input size grows. This is evident from the longer runtimes observed for larger datasets.
     *
     * - Selection Sort performs slightly better than Insertion Sort and Bubble Sort but still has a quadratic time complexity. It also exhibits poor performance with increasing input sizes.
     *
     * - ShellSort, MergeSort, and QuickSort have significantly better performance than the previous algorithms. They exhibit average-case time complexities of O(n log n) and perform well even for larger input sizes.
     *
     * - Among the three efficient sorting algorithms, QuickSort tends to have the best performance in most cases, followed by MergeSort and ShellSort. However, the relative performance can vary depending on the dataset characteristics and implementation details.
     *
     * - The empirical analysis confirms the theoretical expectations regarding time complexity. Algorithms with lower time complexities, such as O(n log n), generally perform better than those with higher complexities, such as O(n^2), for larger datasets.
     *
     * - It's worth noting that the actual runtime can be influenced by factors like hardware, software, and implementation details. Therefore, conducting multiple runs and averaging the results would provide a more accurate assessment of the algorithms' performance.
     *
     * Overall, this exercise highlights the importance of choosing the right sorting algorithm based on the input size and expected performance. Algorithms with lower time complexities are generally preferred for large datasets, while simpler algorithms like Insertion Sort and Bubble Sort may be sufficient for small or nearly sorted arrays.
     */
}

