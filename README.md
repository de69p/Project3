Project3 is a Java program that demonstrates various sorting algorithms and performs an empirical analysis of their performance. The program implements several sorting algorithms such as Insertion Sort, Bubble Sort, Selection Sort, ShellSort, MergeSort, and QuickSort. It also includes a method to generate random arrays for testing purposes and performs an empirical analysis of the sorting algorithms' execution times.

## Table of Contents
- [Sorting Algorithms](#sorting-algorithms)
- [Empirical Analysis](#empirical-analysis)
- [Contributing](#contributing)


The program will demonstrate the usage of different sorting algorithms by sorting a predefined array of numbers and printing the results. It will also perform an empirical analysis of the sorting algorithms' performance for different input sizes.

## Sorting Algorithms

The program implements the following sorting algorithms:

- **Insertion Sort**: Sorts an array by repeatedly inserting each element into its correct position in a sorted subarray.
- **Bubble Sort**: Sorts an array by repeatedly swapping adjacent elements if they are in the wrong order.
- **Selection Sort**: Sorts an array by repeatedly selecting the minimum element from the unsorted part and swapping it with the first element.
- **ShellSort**: Sorts an array using the ShellSort algorithm, which is an optimized variation of the Insertion Sort algorithm.
- **MergeSort**: Sorts an array using the MergeSort algorithm, which divides the array into two halves, sorts them separately, and then merges them.
- **QuickSort**: Sorts an array using the QuickSort algorithm, which partitions the array into smaller subarrays and recursively sorts them.

## Empirical Analysis

The program includes an empirical analysis of the sorting algorithms' performance. It measures the execution time of each sorting algorithm for different input sizes and outputs the results. The analysis provides insights into the time complexity and relative performance of the sorting algorithms.

Here are the key observations from the empirical analysis:

- **Insertion Sort** and **Bubble Sort** have the poorest performance among the tested algorithms. They exhibit quadratic time complexity, resulting in significantly longer runtimes for larger datasets.
- **Selection Sort** performs slightly better than Insertion Sort and Bubble Sort but still has a quadratic time complexity. It also exhibits poor performance with increasing input sizes.
- **ShellSort**, **MergeSort**, and **QuickSort** have significantly better performance than the previous algorithms. They exhibit average-case time complexities of O(n log n) and perform well even for larger input sizes.
- Among the three efficient sorting algorithms, **QuickSort** tends to have the best performance in most cases, followed by MergeSort and ShellSort. However, the relative performance can vary depending on the dataset characteristics and implementation details.
- The empirical analysis confirms the theoretical expectations regarding time complexity. Algorithms with lower time complexities generally perform better than those with higher complexities for larger datasets.
- The actual runtime can be influenced by factors like hardware, software, and implementation details. Therefore, conducting multiple runs and averaging the results would provide a more accurate assessment of the algorithms' performance.

## Contributing

Contributions are welcome! If you find any issues or want to add new features or improvements to the program, feel free to create a pull request.




