import java.util.ArrayList;

public interface IService {

    public void searchByCategory(ArrayList<Library> list);
    public void maxDownload(ArrayList<DigitalDocument>  documentList);
    public void searchByYear(ArrayList<Magazine> listMagazine);
}
