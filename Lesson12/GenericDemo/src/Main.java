import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        ClassGeneric<String> str = new ClassGeneric<>("k");
        System.out.println(str.getObj());

        ClassGeneric<Double> doubleGeneric = new ClassGeneric<>(5.5);
        System.out.println(doubleGeneric.getObj());

        System.out.println("______________________");
        Integer[] intArr = new Integer[5];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
        }
        printArray(intArr);

        Double[] doubleArr = new Double[5];
        for (int i = 0; i < doubleArr.length; i++) {
            doubleArr[i] = i + 0.5;
        }
        printArray(doubleArr);

        String[] stringArr = new String[5];
        for (int i = 0; i < stringArr.length; i++) {
            stringArr[i] = "array-" + i;
        }
        printArray(stringArr);

        PairGeneric<String, String> person1 = new PairGeneric<>("1", "K");
        PairGeneric<Integer, String> person2 = new PairGeneric<>(1, "K");

// Wildcard
        System.out.println("______________________");
        ArrayList<String> strList = new ArrayList<>();
        strList.add("JAVA");
        strList.add("HTML");
        strList.add("CSS");

        printList(strList);

        ArrayList<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);

        printList(intList);
    }

    public static <E> void printArray(E[] arr) {// dùng in cho cả interger. double, string
        for (E element : arr) {
            System.out.println(element + "\t");
        }
    }

    public static void printList(ArrayList<?> arr) {// dùng in cho Wildcard
        for (Object obj : arr) {
            System.out.println(obj);

            // Number: Interger, Double, Float
            //<?> dùng hết Number + String
            //<? extend Number> dùng all Number
            //<? super Interger> dùng interger
        }
    }
}