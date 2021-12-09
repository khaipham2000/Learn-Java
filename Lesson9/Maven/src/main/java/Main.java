import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
Person p = new Person(123,"Khai", LocalDate.now(),"mkp","01234");
        System.out.println(p.getName());
    }
}
