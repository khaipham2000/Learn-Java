import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Map <Integer, String> maps = new HashMap<>();
//        maps.put(1,"Java");
//        maps.put(2,"HTML");
//        maps.put(3,"Ruby");
//        maps.put(4,"PHP");
//
//        System.out.println(maps);// sắp xếp theo thứ tự của Key, ko muốn sắp xếp dung HashMap
//
//        maps.put(4, "Python");// update Java thành Python
//        System.out.println(maps);
//
//        for (Map.Entry<Integer, String> entry : maps.entrySet()){
//            System.out.println(entry.getKey() +"-" + entry.getValue());
//    }
//
//        Map<Integer, String> list = new TreeMap<>(new Comparator<Integer>() {// sắp xếp theo thứ tự giảm dần
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        });
//        list.put(4, "Java");
//        list.put(7, "PHP");
//        list.put(2, "JK");
//
//        for (Map.Entry<Integer, String> entry : list.entrySet()){
//            System.out.println(entry.getKey() +"-" + entry.getValue());
//        }

        Service se = new Service();
        ArrayList<Person> persons = se.getAllPerson();
        System.out.println(" Danh sách: ");
        se.printList(persons);

        Map<Gender, Integer> countGender = se.countByGender(persons);

        for (Map.Entry<Gender, Integer> entry : countGender.entrySet()){
            System.out.println(entry.getKey() +"-" + entry.getValue());
        }

}
}
