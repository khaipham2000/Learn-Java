import java.util.ArrayList;
import java.util.Scanner;

public class SearchProduct {

    public static void menu(){
        System.out.println();
        System.out.println("-- MENU --");
        System.out.println("1 - Danh Mục Laptop: ");
        System.out.println("2 - Danh Mục Điện Thoại: ");
        System.out.println("3 - Danh Mục Phụ Kiện: ");
        System.out.println("4 - Danh Mục Apple: ");
        System.out.println("0 - Kết thúc chương trình ! ");
    }

    public static void choicemenu(){
    Scanner sc = new Scanner(System.in);
    ArrayList<FPT> dataFPT = Service.listFPT();
    Service se = new Service();
    boolean isCheck = false;

    while (!isCheck){
        menu();
        System.out.println(" Nhập danh mục chọn: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice){
            case 1:
                for (int i = 0 ; i< dataFPT.size(); i++){
                    for (int j =0; j < dataFPT.get(i).getCategory().length; j++){
                        if (dataFPT.get(i).getCategory()[j].equals("Laptop")){
                            System.out.println(dataFPT.get(i));
                        }
                    }
                }
                break;
        }
    }


}

}