 class MyRunnable implements Runnable
{   // instance variable
    String str;
    int count;
    // constructor
    public MyRunnable(String str, int count) {
        this.str = str;
        this.count = count;
    }

    public void run()
    {
        for(int i=1;i<=count;i++){
            System.out.print(str);
        }
    }
}


public class ThreadExample {

    public static void main(String[]args){

        Thread t1 = new Thread (new MyRunnable ("A", 10));

        Thread t2 = new Thread (new MyRunnable ("B", 20));

        t1.start();

        t2.start();

    }

}
