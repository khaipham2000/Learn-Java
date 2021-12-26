import java.time.LocalDate;
import java.util.*;

public class Service implements IService {
    Scanner sc = new Scanner(System.in);

    public void searchByCategory(ArrayList<Library> list) {
        System.out.print("Nhập thể loại cần tìm : ");
        String category1 = sc.nextLine();
        System.out.println("Danh sách: ");
        int count1 = 0;
        list.stream()
                .filter(i -> (Arrays.toString(i.getCategory()).toLowerCase().contains(category1.toLowerCase())))
                .forEach(i -> System.out.println(i));
        long count = list.stream()
                .filter(i -> (Arrays.toString(i.getCategory()).toLowerCase().contains(category1.toLowerCase())))
                .count();
        if (count == 0) {
            System.out.println("Không có sách cần tìm!!!");
        }
    }

    public void maxDownload(ArrayList<DigitalDocument> listDocument) {
        Collections.sort(listDocument, new Comparator<DigitalDocument>() {
            @Override
            public int compare(DigitalDocument o1, DigitalDocument o2) {
                return (int) (o2.getDownload() - o1.getDownload());
            }
        });
        System.out.print(" Top 5 tài liệu điện tử được tải nhiều nhất: ");
        listDocument.stream().limit(5).forEach(i -> System.out.println(i));
    }

    public void searchByYear(ArrayList<Magazine> listMagazine) {
        LocalDate localDate = LocalDate.now();
        int year = localDate.getYear();
        listMagazine.stream().filter(i -> i.getReleaseDay().getYear() == (year)).forEach(i -> System.out.println(i));
        long count = listMagazine.stream().filter(i -> i.getReleaseDay().getYear() == (year)).count();
        if (count == 0) {
            System.out.println("Không có tạp chí nào trong năm nay!!!");
        }
    }
}



