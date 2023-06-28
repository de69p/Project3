Project3 is a Java program that demonstrates various sorting algorithms and performs an empirical analysis of their performance. The program implements several sorting algorithms such as Insertion Sort, Bubble Sort, Selection Sort, ShellSort, MergeSort, and QuickSort. It also includes a method to generate random arrays for testing purposes and performs an empirical analysis of the sorting algorithms' execution times.

## Table of Contents
- [Sorting Algorithms](#sorting-algorithms)
- [Empirical Analysis](#empirical-analysis)
- [Contributing](#contributing)



The program will demonstrate the usage of different sorting algorithms by sorting a predefined array of numbers and printing the results. It will also perform an empirical analysis of the sorting algorithms' performance for different input sizes.

## Sorting Algorithms

The program implements the following sorting algorithms:

- **Insertion Sort**: Sorts an array by repeatedly inserting each element into its correct position in a sorted subarray. It has a time complexity of O(n^2).
- **Bubble Sort**: Sorts an array by repeatedly swapping adjacent elements if they are in the wrong order. It has a time complexity of O(n^2).
- **Selection Sort**: Sorts an array by repeatedly selecting the minimum element from the unsorted part and swapping it with the first element. It has a time complexity of O(n^2).
- **ShellSort**: Sorts an array using the ShellSort algorithm, which is an optimized variation of the Insertion Sort algorithm. It has an average-case time complexity of O(n log n).
- **MergeSort**: Sorts an array using the MergeSort algorithm, which divides the array into two halves, sorts them separately, and then merges them. It has an average-case time complexity of O(n log n).
- **QuickSort**: Sorts an array using the QuickSort algorithm, which partitions the array into smaller subarrays and recursively sorts them. It has an average-case time complexity of O(n log n).

## Empirical Analysis

The program includes an empirical analysis of the sorting algorithms' performance. It measures the execution time of each sorting algorithm for different input sizes and outputs the results. The analysis provides insights into the time complexity and relative performance of the sorting algorithms.

Here are the key observations from the empirical analysis:

- **Insertion Sort** and **Bubble Sort** have the poorest performance among the tested algorithms. They exhibit quadratic time complexity, resulting in significantly longer runtimes for larger datasets.
- **Selection Sort** performs slightly better than Insertion Sort and Bubble Sort but still has a quadratic time complexity. It also exhibits poor performance with increasing input sizes.
- **ShellSort**, **MergeSort**, and **QuickSort** have significantly better performance compared to the previous algorithms. They exhibit sub-quadratic time complexity, resulting in much faster runtimes for larger datasets.
- Among the three efficient algorithms, **QuickSort** consistently performs the best in terms of runtime. It has an average-case time complexity of O(n log n), which allows it to handle large datasets efficiently.


