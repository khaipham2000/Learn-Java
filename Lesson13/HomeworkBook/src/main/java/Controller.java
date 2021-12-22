import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class Controller {
    Service service;
    ArrayList<Book> listBook;
    Scanner sc;

    public Controller() {
        service = new Service();
        listBook = service.getData();
        sc = new Scanner(System.in);
    }

    public void mainMenu(){
        boolean isCheck = false;
        while (!isCheck){
            System.out.println("--MENU-- ");
            System.out.println("1 - Danh sách sách ");
            System.out.println("2 - Danh sách sách sắp xếp theo thể loại: ");
            System.out.println("3 - Số lượng sách theo thể loại: ");
            System.out.println("4 - Danh sách sách sắp xếp theo năm phát hành: ");
            System.out.println("5 - Tìm sách theo tên: ");
            System.out.println("0 - Kết thúc chương trình!!! ");
            System.out.println(" Nhập lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    service.printList(listBook);
                    break;
                case 2:
                    service.filterListByCategory(listBook);
                    break;
                case 3:
                    Map<String, Integer> countCategory = service.countByCategory(listBook);
                    for (Map.Entry<String, Integer> entry : countCategory.entrySet()) {
                        System.out.println(entry.getKey() + " : " + entry.getValue() + " quyển");
                    }
                    service.countByCategory(listBook);
                    break;
                case 4:
                    service.sortByYear(listBook);
                    break;
                case 5:
                    service.searchByTitle(listBook);
                    break;
                default:
                    isCheck = true;
                    System.exit(0);
                    break;
            }
        }
    }
}
