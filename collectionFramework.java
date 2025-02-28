import java.util.ArrayList;
import java.util.Iterator;

public class collectionFramework {
    public static void main(String[] args) {

        ArrayList<Integer> a1 = new ArrayList<>(3);

        a1.add(100);
        a1.add(200);
        a1.add(300);

        System.out.println(a1);

        Iterator<Integer> itr = a1.iterator();

        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}
