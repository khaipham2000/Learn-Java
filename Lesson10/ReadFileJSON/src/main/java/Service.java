import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class Service implements IService {

    public  ArrayList<Person> getData(){
        ArrayList<Person> list = new ArrayList<>();

        //tao doi tuong gson
        Gson gson = new Gson();

        //Doc file
        try {
            FileReader reader = new FileReader("person.json");

            //Lay kieu mong muon duoc convert sang
            Type objectType = new TypeToken<ArrayList<Person>>(){}.getType();
            //System.out.println(objectType);

//            Type type = new TypeToken<Person>(){}.getType();
//            System.out.println(type);



            list = gson.fromJson(reader, objectType);


        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        }
        return list;
    }

    public void printList( ArrayList<Person> list){
        for (Person p: list) {
            System.out.println(p);
        }
    }

    @Override
    public void sortByName(ArrayList<Person> list) {

    }

    @Override
    public void sortByEmail(ArrayList<Person> list) {

    }

    @Override
    public void insertPerson(ArrayList<Person> list) {

    }


}
