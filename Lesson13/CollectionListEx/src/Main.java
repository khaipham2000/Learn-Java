import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> linkedList =new LinkedList<>();
        linkedList.add("JAVA");
        linkedList.add("HTML");
        linkedList.add("PHP");
        linkedList.add("Python");

        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()){// hasNext ktra phần tử kế tiếp
            System.out.println(itr.next());
        }

        linkedList.remove("JAVA");// remove
        System.out.println(linkedList);

        if ( linkedList.remove("java")){
            System.out.println(" Xóa ko thành công");

            Collections.shuffle(linkedList);// đảo vị trí random
            System.out.println(linkedList);

            Collections.sort(linkedList);// sắp xếp theo thứ tự
            System.out.println(linkedList);

            Collections.reverse(linkedList);// đảo ngược vị trí
            System.out.println(linkedList);
        }
    }
}
