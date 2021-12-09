import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<FPT> dataFPT = Service.listFPT();
        System.out.println(" Danh sách sản phẩm : " + "\n");
        for(FPT sub: dataFPT ){
            System.out.println(sub);
        }
        SearchProduct.choicemenu();
    }
}
