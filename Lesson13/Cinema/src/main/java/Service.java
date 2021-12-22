import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Service implements IService {
    public ArrayList<Movie> getData() {
        ArrayList<Movie> list = new ArrayList<>();

        Gson gson = new Gson();

        try {
            FileReader reader = new FileReader("Movie.json");


            Type objectType = new TypeToken<ArrayList<Movie>>() {
            }.getType();
            System.out.println(objectType);

            Type type = new TypeToken<ArrayList<Movie>>() {
            }.getType();
            System.out.println(type);


            list = gson.fromJson(reader, objectType);

        } catch (FileNotFoundException e) {
            System.out.println(" Ko tìm thấy file. ");
            ;
        }
        return list;
    }

    public void printList(ArrayList<Movie> list) {
        for (Movie p : list) {
            System.out.println(p);
        }
    }

    @Override
    public void sortByName(ArrayList<Movie> list) {
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                String name1 = o1.getName();
                String name2 = o2.getName();
                return o1.getName().replace("[-+.^:,]","").compareTo(o2.getName().replace("[-+.^:,]",""));
            }
        });
        System.out.println(" Danh sách sắp xếp theo tên: ");
        sol(list);
    }

    public static void sol(ArrayList<Movie> listName) {
        for (Movie a : listName) {
            System.out.println(a);
        }
    }

    @Override
    public void sortByLength(ArrayList<Movie> list) {
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                int length1 = o1.getLength();
                int length2 = o2.getLength();
                return o1.getLength() - (o2.getLength());
            }
        });
        System.out.println(" Danh sách sắp xếp theo thời lượng: ");
        show(list);
    }

    public static void show(ArrayList<Movie> listLength) {
        for (Movie p : listLength) {
            System.out.println(p);
        }
    }

    @Override
    public void sortByView(ArrayList<Movie> list) {
        Collections.sort(list, new Comparator<Movie>() {
            @Override
            public int compare(Movie o1, Movie o2) {
                int view1 = o1.getView();
                int view2 = o2.getView();
                return o1.getView() - (o2.getView());
            }
        });
        System.out.println(" Danh sách sắp xếp theo thời lượng: ");
        saw(list);
    }

    public static void saw(ArrayList<Movie> listView) {
        for (Movie c : listView) {
            System.out.println(c);
        }
    }
}