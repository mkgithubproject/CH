public class Main {
 
    public static void main(String[] args) {
 
        int daysInMonth[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String months[] = { "JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER" };
        String days[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
 
        int yy, mm, dd, startDay;
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter the year : ");
        yy = sc.nextInt();
 
        System.out.print("Enter month : ");
        mm = sc.nextInt();
 
        // Checking whether it is a leap year or not
        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0))
            daysInMonth[1] = 29;
        else
            daysInMonth[1] = 28;
 
        // Getting the starting day of the month
        dd = 1;
        startDay = 0;
        int y = yy - 1;
        while (y >= 1700) {
            startDay += 5;
            if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
                startDay++;
            y -= 100;
        }
        for (int i = 0; i < mm - 1; i++)
            startDay += daysInMonth[i];
        startDay += yy - 1700;
        startDay %= 7;
 
        // Printing the calendar
        System.out.println("MONTH:" + months[mm - 1]);
        for (int i = 0; i < 7; i++)
            System.out.print("\t" + days[i]);
        System.out.println();
        for (int i = 0; i < startDay; i++)
            System.out.print("\t");
        for (int i = 1; i <= daysInMonth[mm - 1]; i++) {
            System.out.print("\t" + i);
            if ((startDay + i) % 7 == 0)
                System.out.println();
        }
    }
}
