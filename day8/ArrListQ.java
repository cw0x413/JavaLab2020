import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ArrListQ {
    List<String> queueList = new ArrayList<String>();

    void enqueue(String data) {
        queueList.add(data);
    }

    String dequeue() {
        return queueList.remove(0);
    }

    void display() {
        System.out.print("Displaying ");
        Iterator<String> it = queueList.iterator();
        while (it.hasNext())
            System.out.println(it.next() + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrListQ arrListQ = new ArrListQ();
        int CASE = 10;
        while (CASE != 4) {
            System.out.println("Enter the case \n1)enqueue\n2)dequeue\n3)display\n4)exit");
            CASE = sc.nextInt();
            if (CASE == 1) {
                System.out.println("Enter the string to enqueue");
                String string = sc.next();
                arrListQ.enqueue(string);
            } else if (CASE == 2) {
                System.out.println("dequeued " + arrListQ.dequeue());
            } else if (CASE == 3)
                arrListQ.display();
        }
        System.out.println("Exitted");
        sc.close();
        System.exit(0);
    }
}
