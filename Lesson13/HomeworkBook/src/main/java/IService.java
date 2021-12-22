import java.util.ArrayList;
import java.util.Map;

public interface IService {
    public void printList(ArrayList<Book> list);
    public void filterListByCategory(ArrayList<Book> list);
    public Map<String, Integer> countByCategory(ArrayList<Book> list);
    public void sortByYear(ArrayList<Book> list);
    public void searchByTitle (ArrayList<Book> list);
}
