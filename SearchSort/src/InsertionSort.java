import java.io.IOException;

public class InsertionSort {
    public static void sort(String[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j-1].compareTo(a[j]) > 0)
                    exch(a, j, j-1);
                else break;
            }
        }
    }
    // exchange a[i] and a[j]
    private static void exch(Comparable[] a, int i, int j) {
        Comparable swap = a[i];
        a[i] = a[j];
        a[j] = swap;
    }

    // read in a sequence of words from standard input and print
    // them out in sorted order
    public static void main(String[] args) throws Exception {
        String[] a = Merge.getUnsortedNames();
        sort(a);
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }
}
