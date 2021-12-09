
import java.util.ArrayList;

public class AddCustomer {
    public ArrayList<Customer> getData(){
        ArrayList<Customer> listCustomer = new ArrayList<>();
        listCustomer.add(new Customer((listCustomer.size()+1),"John Cena","21/10/1986" ,Gender.Male,"UK","02134629071","JC@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Alicia Key", "11/5/1976",Gender.Female,"CAN","0935123547","AC@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"Anna Torv ", "30/1/1999",Gender.Female,"US","0945509652","AT@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"John Constantine", "1/12/2005",Gender.Male,"Wakanda","0944646387","JCe@gmail.com"));
        listCustomer.add(new Customer((listCustomer.size()+1),"John Wick", "17/4/2000",Gender.Male,"Laos","0374559347","JW@gmail.com"));

        return listCustomer;
    }
}
