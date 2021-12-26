import java.util.ArrayList;
import java.util.Scanner;

public class Controller {

    public void controller() {

        Repository repository = new Repository();
        ArrayList<Book> listBook = repository.getBook();
        ArrayList<Magazine> listMagazine = repository.getMagazine();
        ArrayList<DigitalDocument> listDocument = repository.getDocument();
        ArrayList<Library> list = new ArrayList<>();
        list.addAll(listBook);
        list.addAll(listMagazine);
        list.addAll(listDocument);

        Service service = new Service();
        Scanner sc = new Scanner(System.in);
        boolean isCheck = false;
        while (!isCheck) {
            mainMenu();
            int choice1 = sc.nextInt();
            switch (choice1) {
                case 1:
                    System.out.println("1 - Sách giáo khoa");
                    System.out.println("2 - Tạp chí");
                    System.out.println("3 - Tài liệu điện tử");
                    int choice2 = sc.nextInt();
                    switch (choice2) {
                        case 1:
                            printListBook(listBook);
                            break;
                        case 2:
                            printListMagazine(listMagazine);
                            break;
                        case 3:
                            printListDigitalDocument(listDocument);
                            break;
                        default:
                            System.out.println("Kết thúc xem !!!");
                    }
                    break;
                case 2:
                    service.searchByCategory(list);
                    break;
                case 3:
                    service.maxDownload(listDocument);
                    break;
                case 4:
                    service.searchByYear(listMagazine);
                    break;
                default:
                    System.out.println("Kết thúc chương trình");
                    isCheck = true;
            }
        }
    }

    public static void printListBook(ArrayList<Book> listBook) {
        listBook.stream().forEach(i -> System.out.println(i));
    }

    public static void printListMagazine(ArrayList<Magazine> listMagazine) {
        listMagazine.stream().forEach(i -> System.out.println(i));
    }

    public static void printListDigitalDocument(ArrayList<DigitalDocument> listDocument) {
        listDocument.stream().forEach(i -> System.out.println(i));
    }

    public static void mainMenu(){
        System.out.println("-------Main Menu-------");
        System.out.println("1 - In thông tin sách theo từng loại");
        System.out.println("2 - In thông tin sách theo thể loại");
        System.out.println("3 - In thông tin top 5 tài liệu điện tử được tải về nhiều nhất");
        System.out.println("4 - In thông tin tạp chí xuất bản năm nay");
        System.out.println("0 - Kết thúc chương trình!!!");
        System.out.println("Nhập lựa chọn của bạn: ");
    }
}



