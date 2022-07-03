public class YourNameAssignment2 {
    public static void main(String[] args) {
        // created 4 object of YourNameMonth class
        YourNameMonth month1=new YourNameMonth();
        YourNameMonth month2=new YourNameMonth(2);
        YourNameMonth month3=new YourNameMonth("October");
        YourNameMonth month4=new YourNameMonth(month3);
        System.out.println(month1.get());// output 0
        System.out.println(month2.get());//output 2
        System.out.println(month3.get());//output 10
        month1.set(9);// set month 9 to month1 object
        System.out.println(month1.toString());// output Month is 9
        System.out.println(month2.toString());// output Month is 2
        System.out.println(month3.toString());// output Month is 10
        System.out.println(month4.toString());// output Month is 10
        System.out.println(month1.equals(month2));//output false ,don't have same value of number
        System.out.println(month2.compareTo(month3));//output -1 , dont have same value of number field
        YourNameMonth copyMonth=month3.copy();// copy month3 to copyMonth
        System.out.println(copyMonth.toString());//output 10

    }
}
