import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ClassMyArray<String> str = new ClassMyArray<>("k");
        System.out.println(str.getObj());

        ClassMyArray<Integer> songuyen = new ClassMyArray<>(1);
        System.out.println(songuyen.getObj());

        ClassMyArray<Double> sothuc = new ClassMyArray<>(1.5);
        System.out.println(sothuc.getObj());

        ClassMyArray<Boolean> check = new ClassMyArray<>(true);
        System.out.println(check.getObj());
    }
    public static void printList(ArrayList<?> arr) {
        for (Object obj : arr) {
            System.out.println(obj);
        }
    }}
