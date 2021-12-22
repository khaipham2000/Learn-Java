import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
//        Queue <String> queue = new LinkedList<>();
//        queue.add("Java");
//        queue.add("HTML");
//        queue.add("JS");
//        queue.add("Ruby");
//
//        System.out.println(queue);
//
//        System.out.println(queue.remove());// mặc định xóa phần tử đầu, nếu ko có phân ftuwr nào thì sẽ ném ra ngoại lệ
//        System.out.println(queue);
//
//        System.out.println(queue.poll());// xóa phần tử, nếu ko có phần tử nào trả về null
//        System.out.println(queue);
//
//        System.out.println(queue.element());// in phần tử đầu tiên,nếu ko có phần tử nào thì ném ra ngoại lệ
//        System.out.println(queue.peek());//in phần tử đầu tiên,nếu ko có phần tử nào trả về null

        PriorityQueue<Integer> number = new PriorityQueue<>();
        number.add(5);
        number.add(7);
        number.add(1);
        number.add(9);

        System.out.println(number);// chỉ đẩy phần tử nhỏ nhất lên đầu, ko sắp xếp
        System.out.println(" Phần tử dầu tiên:" +number.remove());
        System.out.println(number);

        number.add(2);
        System.out.println(number);

        PriorityQueue<String> strings = new PriorityQueue<>();
        strings.add("John");
        strings.add("Anna");
        strings.add("Victor");
        strings.add("Ben");

        System.out.println(strings);// ưu tiên theo abc, mấy cái còn lại sắp xếp random

    }
}
