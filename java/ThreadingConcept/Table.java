class Table
{
    void printTable(int n)
    {  // make thread synchronized
        synchronized (this)
        {   // print table
            for(int i=1;i<=10;i++)
            {
                System.out.print(n*i+" ");
                try
                {
                    Thread.sleep(500);
                }
                catch(Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
            System.out.println();
        }
    }
}
 // declare thread
class Mythread1 extends Thread
{
    Table t;
    Mythread1(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(3);
    }
}

// declare thread
class Mythread2 extends Thread
{
    Table t;
    Mythread2(Table t)
    {
        this.t=t;
    }
    public void run()
    {
        t.printTable(7);
    }
}

class Use
{
    public static void main(String args[])
    {
        Table obj = new Table();
        Mythread1 th1 = new Mythread1(obj);// create object of thread
        Mythread2 th2 = new Mythread2(obj);
        th1.start();// start thread
        th2.start();
    }
}

