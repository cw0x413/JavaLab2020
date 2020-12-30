import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class LLString {
    LinkedList<String> linkedList = new LinkedList<String>();

    void lt5() {
        System.out.println("Displaying names with length less than 5");
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() < 5)
                System.out.print(str + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 0;
        LLString llString = new LLString();
        Scanner scan = new Scanner(System.in);
        while (n != 6) {
            System.out.println("1)Insert a element to linked list");
            System.out.println("2)Insert a element at a position");
            System.out.println("3)Delete by key ");
            System.out.println("4)Delete at a position");
            System.out.println("5)Display names less than length 5");
            System.out.println("6)Quit\nEnter an option");
            n = scan.nextInt();
            if (n == 1) {
                System.out.println("Enter a String to insert");
                scan.nextLine();
                String data = scan.nextLine();
                llString.linkedList.add(data);
            } else if (n == 2) {
                System.out.println("Enter the position");
                int pos = scan.nextInt();
                scan.nextLine();
                System.out.println("Enter the string");
                String data = scan.nextLine();
                llString.linkedList.add(pos, data);
            } else if (n == 3) {
                System.out.println("Enter the element to delete");
                scan.nextLine();
                String key = scan.nextLine();
                llString.linkedList.remove(key);
            } else if (n == 4) {
                System.out.println("Enter the position");
                int pos = scan.nextInt();
                llString.linkedList.remove(pos);
            } else if (n == 5) {
                llString.lt5();
            }
        }
        scan.close();
    }
}
