public class Main {
    public static void main(String[] args) {
        // tạo bằng extend class Thread
        CreateThread thread1 = new CreateThread();
        System.out.println(thread1.getId()+"-"+ thread1.getName());
        thread1.start();// in ra phương thức run, chỉ thực hiện chạy 1 lần

        CreateThread thread2 = new CreateThread();
        System.out.println(thread2.getId()+"-"+ thread2.getName());
        thread2.setName("Luồng 2");// đổi tên thread
        thread2.start();

        try {// cho abc chạy xuống cuối
            thread2.join(3000);// chạy hết 300 millis trong thread2 thì chạy abc
          //  thread2.join()// đợi cho thread2 chạy hết thì ms chạy abc
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // Tạo bằng implement interface Runnable
        ThreadByInterface thread = new ThreadByInterface();
        Thread t = new Thread(thread);

        t.start();
    }
}
