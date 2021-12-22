import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.Callable;

public class Service implements IService {
    public ArrayList<Book> getData() {
        ArrayList<Book> list = new ArrayList<>();
        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("Book.json");


            Type objectType = new TypeToken<ArrayList<Book>>() {
            }.getType();
            System.out.println(objectType);

            Type type = new TypeToken<ArrayList<Book>>() {
            }.getType();
            System.out.println(type);


            list = gson.fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            System.out.println(" Ko tìm thấy file. ");
            ;
        }
        return list;
    }

    public void printList(ArrayList<Book> list) {
        for (Book p : list) {
            System.out.println(p);
        }
    }

    // Lọc sách theo thể loại
    public void filterListByCategory(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập thể loại sách muốn tìm : ");
        int count = 0;
        String category = null;
        category = sc.nextLine();
        System.out.println("Danh sách sách theo thể loại : ");
        for (Book p : list) {
            for (int i = 0; i < p.getCategory().length; i++) {
                if (p.getCategory()[i].toLowerCase().contains(category.toLowerCase())) {
                    System.out.println(p);
                    count++;
                }
            }
        }
        if (count == 0) {
            System.out.println("Không có sách nào");
        }
    }

    //Đếm sách theo thể loại
    public Map<String, Integer> countByCategory(ArrayList<Book> list) {
        Map<String, Integer> CategoryMap = new HashMap<>();

        for (Book p : list) {
            for (int i = 0; i < p.getCategory().length; i++) {
                if (CategoryMap.get(p.getCategory()[i]) == null) {
                    CategoryMap.put(p.getCategory()[i], 1);
                } else {
                    CategoryMap.put(p.getCategory()[i], CategoryMap.get(p.getCategory()[i]) + 1);
                }
            }
        }
        return CategoryMap;
    }


    //Sắp xếp sách theo năm xuất bản
    public void sortByYear(ArrayList<Book> list) {
        Collections.sort(list, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPublishingYear() - o2.getPublishingYear();
            }
        });
        System.out.println("Danh sách sách sắp xếp theo năm phát hành");
        printList(list);
    }

    public static void saw(ArrayList<Book> listYear) {
        for (Book c : listYear) {
            System.out.println(c);
        }
    }

    //Tìm sách theo tên
    public void searchByTitle(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sách muốn tìm : ");
        int count = 0;
        String title = "";
        title = sc.nextLine();
        System.out.println("Danh sách book : ");
        for (Book p : list) {
            if (p.getTitle().toLowerCase().contains(title.toLowerCase())) {
                System.out.println(p);
                count++;
            }
        }
        if (count == 0) {
            System.out.println("không tìm thấy sách");
        }
    }
}

