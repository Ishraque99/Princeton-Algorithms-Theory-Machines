import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Merge {
    private static String[] aux;

    public static void main(String[] args) throws Exception {
        String[] a = getUnsortedNames();
        sort(a);
        for (int i = 0; i < a.length; i++) {
            StdOut.print(a[i] + " ");
        }
        StdOut.println();
    }
    public static void sort(String[] a) {
        aux = new String[a.length];
        sort(a, 0, a.length);
    }
    public static void sort(String[] a, int lo, int hi) {
        int N = hi - lo;
        if (N <= 1) return;
        int mid = lo + N/2;
        sort(a, lo, mid);
        sort(a, mid, hi);
        merge(a, lo, mid, hi);
    }
    public static void merge(String[] a, int lo, int mid, int hi) {

        int i = lo;
        int j = mid;
        int N = hi-lo;

        //Merge a[lo, mid) with a[mid, hi)
        for (int k = 0; k<N; k++) {
            if (i == mid) aux[k] = a[j++];
            else if (j == hi) aux[k] = a[i++];
        }
        //Copy back into a[lo, hi)
        for (int k = 0; k < N; k++) {
            a[lo+k] = aux[k];
        }
    }

    public static String[] getUnsortedNames() throws Exception{
        File f = new File("names16.txt");

        Scanner sc = new Scanner(f);
        List<String> namesList = new ArrayList<>();
        System.out.println("file: ");
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            namesList.add(s);
        }

        System.out.println("Unsorted array: ");



        String[] names = new String[namesList.size()];

        names = namesList.toArray(names);
        for (String name : names) {
            System.out.print(name + ", ");
        }
        System.out.println("");
        return names;
    }
}
