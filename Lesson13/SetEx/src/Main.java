import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<Integer> number = new HashSet<>();// HashSet là kế thừa từ set
        number.add(4);
        number.add(7);
        number.add(6);
        number.add(3);
        number.add(1);
        number.add(4);

        if (!number.add(4)){
            System.out.println("Đã có phần tử trong danh sách");
        }else{
            System.out.println("Thêm thành công");
        }

        System.out.println(number);// sắp xếp nhưng ko cho chùng lặp

       long count = number.stream().filter(i -> i%2==0 ).count();// đếm có bn số chia hết cho 2
        System.out.println(count);
    }
}
