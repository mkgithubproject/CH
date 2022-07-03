// replace all the places 'YourName' with your actual name
public class YourNameMonth {
    private int number;// instance variable

    public YourNameMonth() {// default constructor
        number=0;// set number to 0
    }

    public YourNameMonth(int number) {// constructor takes number as an argument
        if(number<1 || number >12){
            number=1;// if number is out of range set to 1
        }else{
            this.number = number;// else set with argument received
        }
    }
    private int getMonthNumber(String month){// function which returns the number according to give month
        int number;
        if(month.equalsIgnoreCase("january")){
            number=1;
        }else if(month.equalsIgnoreCase("february")){
            number=2;
        }else if(month.equalsIgnoreCase("march")){
            number=3;
        }else if(month.equalsIgnoreCase("april")){
            number=4;
        }else if(month.equalsIgnoreCase("may")){
            number=5;
        }else if(month.equalsIgnoreCase("june")){
            number=6;
        }else if(month.equalsIgnoreCase("july")){
            number=7;
        }else if(month.equalsIgnoreCase("august")){
            number=8;
        }else if(month.equalsIgnoreCase("september")){
            number=9;
        }else if(month.equalsIgnoreCase("october")){
            number=10;
        }else if(month.equalsIgnoreCase("november")){
            number=11;
        }else if(month.equalsIgnoreCase("december")){
            number=12;
        }else{
            number=1;
        }
        return number;
    }
    //constructor which accepts the month as a string and set the number according month
    public YourNameMonth(String month) {
       this.number=getMonthNumber(month);
    }
    // constructor which accepts the object of that class and set the number accordingly
    public YourNameMonth(YourNameMonth month) {
        this.number=month.number;
    }
    // function which returns the number of current object
    public int get() {
        return number;
    }
    // function which set the number of current object
    public void set(int number) {
        this.number = number;
    }
    // function which accepts the month as a string and returns the number accordingly
    public void getName(String month){
        this.number=getMonthNumber(month);
    }
    // returns the copy of current object
    public YourNameMonth copy(){
        return this;
    }
   // toString methods returns string with current object description
    @Override
    public String toString() {
        return "Month is "+number;
    }
    // function which check two objects are equals or not
    public boolean equals(YourNameMonth month2){
        if(month2.number==this.number){
            return true;
        }else{
            return false;
        }
    }
    // compare two object via its number
    public int compareTo(YourNameMonth month2){
        if(month2.number==this.number){
            return 0;
        }else{
            return -1;
        }
    }
}
