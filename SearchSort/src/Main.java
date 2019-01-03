import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("names16.txt");
        Scanner sc = new Scanner(f);
        List<String> namesList = new ArrayList<>();
        System.out.println("file: ");
        while (sc.hasNextLine()) {
            String s = sc.nextLine();
            namesList.add(s);
        }

        System.out.println("Unsorted array: ");
        for (String name : namesList) {
            System.out.print(name + ", ");
        }
        System.out.println("");

        String[] names = new String[namesList.size()];

        names = namesList.toArray(names);
    }
}