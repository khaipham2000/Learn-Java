import java.util.InputMismatchException;

public class CreateThread extends Thread{
    @Override
    public void run() {
     //   System.out.println("abc");

        for (int i = 10; i > 0; i--){
        System.out.println(i);
        try {
            Thread.sleep(1000);
        }catch ( InterruptedException e){
            e.printStackTrace();
        }
        }
        System.out.println("CMNM");
    }
}
