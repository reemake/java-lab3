import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Class for performance test of ArrayList and LinkedList
 * @author Nikita Safonov, student of AMM VSU, 3rd year, 3rd group
 * @see CheckTime
 */
public class PerformanceTest {

    public static void main(String[] args) {
        int[] size = new int[] {1000, 5000, 50000};
        System.out.println("-------------------------------------------");
        System.out.println("\t | List size | ArrayList | LinkedList |");
        System.out.println("-------------------------------------------");
        for (int i = 0; i < 3; i++){
            ArrayList<Integer> arrayList = new ArrayList<>();
            LinkedList<Integer> linkedList = new LinkedList<>();

            System.out.print("Add  | ");
            System.out.printf("%8d", size[i]);
            System.out.print("  |");
            System.out.printf("%11d", new CheckTime().addCheckTime(arrayList, size[i]));
            System.out.print("|");
            System.out.printf("%12d", new CheckTime().addCheckTime(linkedList, size[i]));
            System.out.println("|");
            System.out.println("-------------------------------------------");

            System.out.print("Get  | ");
            System.out.printf("%8d", size[i]);
            System.out.print("  |");
            System.out.printf("%11d", new CheckTime().getCheckTime(arrayList,  size[i]));
            System.out.print("|");
            System.out.printf("%12d", new CheckTime().getCheckTime(linkedList,  size[i]));
            System.out.println("|");
            System.out.println("-------------------------------------------");

            System.out.print("Del  | ");
            System.out.printf("%8d", size[i]);
            System.out.print("  |");
            System.out.printf("%11d", new CheckTime().deleteCheckTime(arrayList,  size[i]));
            System.out.print("|");
            System.out.printf("%12d", new CheckTime().deleteCheckTime(linkedList,  size[i]));
            System.out.println("|");
            System.out.println("-------------------------------------------");
            System.out.println("-------------------------------------------");
        }
    }
}
