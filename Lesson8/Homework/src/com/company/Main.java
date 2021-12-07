package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);

        ArrayList<NhanVien> listStaff = new ArrayList<>();
        ArrayList<LapTrinhVien> listCoder = new ArrayList<>();
        ArrayList<KiemChungVien> listChecker = new ArrayList<>();

        boolean isCheck = false;
        while (!isCheck){
            menu();
            System.out.print("Nhập lựa chọn của bạn : ");
            int choice = sc.nextInt();

            switch (choice){
                case 1 :
                    System.out.print("Nhập số lượng lập trình viên muốn thêm : ");
                    int a = sc.nextInt();
                    for (int i = 0 ; i < a ; i++){
                        LapTrinhVien coder = new LapTrinhVien();
                        coder.insertLTV();
                        listCoder.add(coder);
                        listStaff.add(coder);
                    }
                    break;
                case 2 :
                    System.out.print("Nhập số lượng kiểm chứng viên muốn thêm : ");
                    int b = sc.nextInt();
                    for (int i = 0 ; i < b ; i++){
                        KiemChungVien checker = new KiemChungVien();
                        checker.insertKCV();
                        listChecker.add(checker);
                        listStaff.add(checker);
                    }
                    break;
                case 3 :
                    System.out.println("Danh sách nhân viên : ");
                    printStaff(listStaff);
                    break;
                case 4 :
                    System.out.println("Danh sách lập trình viên : ");
                    printCoder(listCoder);
                    break;
                case 5 :
                    System.out.println("Danh sách kiểm chứng viên : ");
                    printChecker(listChecker);
                    break;
                default :
                    System.out.println("Kết thúc chương trình !");
                    isCheck = true;
                    System.exit(1);
            }
        }
    }

    public static void printStaff(ArrayList<NhanVien> listStaff){
        for (NhanVien staff : listStaff){
            System.out.println(staff);
        }
    }

    public static void printCoder(ArrayList<LapTrinhVien> listCoder){
        for (LapTrinhVien coder : listCoder){
            System.out.println(coder);
        }
    }

    public static void printChecker(ArrayList<KiemChungVien> listChecker){
        for (KiemChungVien checker : listChecker){
            System.out.println(checker);
        }
    }
    public static void menu(){
        System.out.println();
        System.out.println("-- MENU --");
        System.out.println("1 - Thêm lập trình viên: ");
        System.out.println("2 - Thêm kiểm chứng viên: ");
        System.out.println("3 - Danh sách nhân viên: ");
        System.out.println("4 - Danh sách lập trình viên: ");
        System.out.println("5 - Danh sách kiểm chứng viên: ");
        System.out.println("0 - Kết thúc chương trình ! ");
    }
}
