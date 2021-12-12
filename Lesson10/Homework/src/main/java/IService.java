import java.util.ArrayList;

public interface IService {
    public ArrayList<Movie> getData();
    public void  printList( ArrayList<Movie> list);
    public void sortByName( ArrayList<Movie> list);
    public void sortByLength( ArrayList<Movie> list);
    public void sortByView( ArrayList<Movie> list);
}
