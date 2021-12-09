
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    public void printCustomer(ArrayList<Customer> listCustomer) {
        System.out.println("Danh sách toàn bộ khách hàng: ");
        for (Customer customer : listCustomer) {
            System.out.println(customer);
        }
    }

    // tìm theo giới tính
    public void findGender(ArrayList<Customer> listCustomer) {
        Mainmenu m = new Mainmenu();
        Scanner sc = new Scanner(System.in);
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Danh sách khách hàng nam: ");
                    for (int i = 0; i < listCustomer.size(); i++) {
                        if (listCustomer.get(i).getGender() == Gender.Male) {
                            System.out.println(listCustomer.get(i));
                        }
                    }
                    break;
                case 2:
                    System.out.println("Danh sách khách hàng nữ: ");
                    for (int i = 0; i < listCustomer.size(); i++) {
                        if (listCustomer.get(i).getGender() == Gender.Female) {
                            System.out.println(listCustomer.get(i));
                        }
                    }
                    break;
                case 0:
                    isCheck = true;
                    m.choiceMenu(listCustomer);
                default:
                    System.out.println("Không có lựa chọn này");
            }
        }
    }

    // thêm khách hàng
    public void addNewCustomer(ArrayList<Customer> listCustomer) {
        Gender gender;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui lòng nhập thông tin:");
        System.out.println("Nhập mã khách hàng: ");
        int id = (listCustomer.size() + 1);
        System.out.println("Nhập tên khách hàng: ");
        String name = sc.nextLine();
        System.out.println("Nhập ngày sinh khách hàng: ");
        String birth = sc.nextLine();
        sc.nextLine();
        System.out.println("Nhập 1 chọn giới tính nam và 2 chọn giới tính nữ: ");
        int i = Integer.parseInt(sc.nextLine());
        if (i <= 1) {
            gender = Gender.Male;
        } else {
            gender = Gender.Female;
        }
        System.out.println("Nhập địa chỉ: ");
        String country = sc.nextLine();
        System.out.println("Nhập SĐT: ");
        String mobile = sc.nextLine();
        System.out.println("Nhập Email: ");
        String email = sc.nextLine();

        Customer newCustomer = new Customer(id, name, birth, gender, country, mobile, email); //Tạo đối tượng khách hàng mới
        listCustomer.add(newCustomer);
        System.out.println(newCustomer);
    }

    public void findCustomerID(ArrayList<Customer> listCustomer) {
        Scanner sc = new Scanner(System.in);
        Mainmenu m = new Mainmenu();
        System.out.println("Nhập ID khách hàng tìm kiếm: ");
        int n = sc.nextInt();
        sc.nextLine();
        int count = 0;
        boolean isContinue = false;
        for (int i = 0; i < listCustomer.size(); i++) {
            if (listCustomer.get(i).getId() == n) {
                count++;
                System.out.println(listCustomer.get(i));
                while (!isContinue) {
                    submenu();
                    int choice = sc.nextInt();
                    sc.nextLine();
                    switch (choice) {
                        case 1:
                            System.out.println("Nhập tên mới:");
                            String newName = sc.nextLine();
                            listCustomer.get(i).setName(newName);
                            System.out.println(listCustomer.get(i));
                            break;
                        case 2:
                            System.out.println("Nhập SĐT mới:");
                            String newPhone = sc.nextLine();
                            listCustomer.get(i).setPhone(newPhone);
                            System.out.println(listCustomer.get(i));
                            break;
                        case 3:
                            listCustomer.remove(i);
                            System.out.println("Đã xóa khách hàng có ID: " + n);
                            System.out.println("Hệ thống tự động quay lại menu chính");
                            m.choiceMenu(listCustomer);
                            break;
                        case 0:
                            isContinue = true;
                            m.choiceMenu(listCustomer);
                            break;
                        default:
                            System.out.println("Không có lựa chọn này");
                    }
                }
            }
        }
        if (count == 0) {
            System.out.println("Không có ID khách hàng này, hệ thống quay lại menu chính");
        }


    }

    public static void menu() {
        System.out.println("1 - Hiển thi danh sách khách hàng nam");
        System.out.println("2 - Hiển thi danh sách khách hàng nữ");
        System.out.println("0 - Quay lại menu chính");
    }

    public static void submenu() {
        System.out.println("1 - Thay đổi tên khách hàng");
        System.out.println("2 - Thay đổi SĐT khách hàng");
        System.out.println("3 - Xóa thông tin khách hàng");
        System.out.println("0 - Không thao tác gì, quay lại menu chính");
        System.out.println("Lựa chọn của bạn là: ");
    }
}
