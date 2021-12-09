import java.util.ArrayList;

public class Service {
static ArrayList<FPT> infor;

public static ArrayList<FPT> listFPT(){
    infor = new ArrayList<>();
    infor.add(new FPT(123,"MacBook Air","new",new String[]{"Laptop", "Apple"}, 5, 10000));
    infor.add(new FPT(122,"Dell","new",new String[]{"Laptop"}, 10, 10000));
    infor.add(new FPT(103,"Iphone 12 ","new",new String[]{"Phone", "Apple"}, 145, 30000));
    infor.add(new FPT(123,"Sound Pitch","new",new String[]{"Accessory"}, 5, 10000));
   return infor;

}
}
