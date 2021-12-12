import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    Service service;
    ArrayList<Movie> listMovie;
    Scanner sc;

    public Controller() {
        service = new Service();
        listMovie = service.getData();
        sc = new Scanner(System.in);
    }

    public void mainMenu(){
        boolean isCheck = false;
        while (!isCheck){
            System.out.println("--MENU-- ");
            System.out.println("1 - Danh sách phim ");
            System.out.println("2 - Danh sách phim sắp xếp theo tên: ");
            System.out.println("3 - Danh sách phim sắp xếp theo thời lượng: ");
            System.out.println("4 - Danh sách phim sắp xếp theo lượt xem: ");
            System.out.println(" Nhập lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Danh sach: ");
                    service.printList(listMovie);
                    break;
                case 2:
                    //sắp xếp theo tên
                    service.sortByName(listMovie);
                    break;
                case 3:
                    //sắp xếp  theo thời lượng
                    service.sortByLength(listMovie);
                    break;
                case 4:
                    //sap xep theo view
                    service.sortByView(listMovie);
                    break;
                default:
                    System.out.println("Khong co lua chon nay");
            }
        }
    }
}