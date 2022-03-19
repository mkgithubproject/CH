import java.util.Scanner;

public class HList {
    static int index=0;
    static House[] ArrHouse=new House[1000];

   public HList(){
       // default constructor
       //ArrHouse=new House[1000];
   }
    private static void printAllHouses() {
        //System.out.println("index "+index);

//        for(House h: ArrHouse) {
//            if(h!=null) {
//                System.out.println(h.toString());
//
//            }
//            else {
//                break;
//            }
//        }
      // call helper recursive function
        printAllHousesHelper(ArrHouse,index,0);

    }

    private static void printAllHousesHelper(House[] arrHouse, int index, int i) {
       // base case
           if(i>index){
               return;
           }
           House hs=arrHouse[i];
           if (hs!=null){
               System.out.println(hs.toString());
           }else{
               return;
           }
           // recursive call
           printAllHousesHelper(arrHouse,index,i+1);
    }


    private static void printHousesLessThan(double price) {
//        System.out.println("Enter maximum cost: ");
//        double cost=sc.nextDouble();
//        for(House h:ArrHouse) {
//            if(h!=null && h.getPrice()<=cost) {
//                System.out.println(h.toString());
//            }
//        }
      printHousesLessThanHelper(ArrHouse,price,index,0);

    }

    private static void printHousesLessThanHelper(House[] arrHouse,  double price, int index, int i) {
                    if(i>index){
                        return;
                    }
                    House hs=arrHouse[i];
                    if(hs!=null && hs.getPrice()<price){
                        System.out.println(hs.toString());
                    }
                    printHousesLessThanHelper(arrHouse,price,index,i+1);

    }


    private static boolean removeHouse(int mls) {
        for (int i = 0; i < index; i++) {
            House h = ArrHouse[i];
            if (h != null) {
                if (h.getMls() == mls) {
                    ArrHouse[i] = null;
                    for (int j = i; j < index; j++) {
                        ArrHouse[j] = ArrHouse[j + 1];
                    }
                    return true;
                }
            }
        }
        return  false;

    }


    private static void addHouse(House hs) throws HouseException {
        //System.out.println(index);
        ArrHouse[index]=hs;
        System.out.println("House added Successfully...");
        index=index+1;


    }


    public static void main(String[] args) throws HouseException {
         Scanner sc=new Scanner(System.in);
        while(true) {
            System.out.println("\nWelcome to Real Estate Service\n\nChoose from the following options:\n1. add a house\r\n"
                    + "2. remove a house\r\n"
                    + "3. print houses that cost less than a given price\r\n"
                    + "4. print all the houses\r\n"
                    + "0. end this program\n\nEnter choice: ");
            int choice=sc.nextInt();
            if(choice==0) {
                System.out.println("Program ends");
                break;
            }
            else if(choice==1) {
                sc.nextLine();
                House temp=new House(10001,0,0,"nnnn");
                int m=0;
                while(true) {
                    System.out.println("Enter mls: ");
                    int mls=sc.nextInt();
                    int flag=0;
                    for(House h:ArrHouse) {
                        if(h!=null && h.getMls()==mls) {
                            System.out.println("mls already exists....Enter again");
                            flag=1;
                            break;
                        }


                    }
                    if(flag==1){
                        continue;
                    }else {
                        m=mls;
                    }

                    try {
                        temp.setMls(m);
                        System.out.println("Enter no. of bedrooms: ");

                        int b=sc.nextInt();
                        temp.setBedrooms(b);
                        System.out.println("Enter price: ");
                        double p=sc.nextDouble();

                        temp.setPrice(p);
                        sc.nextLine();
                        System.out.println("Enter name of Seller: ");
                        String s=sc.nextLine();
                        temp.setSeller(s);
                        addHouse(temp);

                    }
                    catch(HouseException e) {
                        System.out.println(e.getMessage());
                        continue;
                    }
                    break;
                }


            }
            else if(choice==2) {
                System.out.println("Enter mls: ");
                int mls=sc.nextInt();
               boolean result= removeHouse(mls);
               if(result==true){
                   System.out.println("House removed successfully...");
               }else{
                   System.out.println("House does not exist for this MLS...");
               }
            }
            else if(choice==3) {
                System.out.println("Enter maximum cost: ");
                double cost=sc.nextDouble();
                printHousesLessThan(cost);
            }
            else if(choice==4) {
                printAllHouses();
            }

            else {
                System.out.println("Wrong choice.....Enter again: ");
                continue;
            }

        }
    }
}
