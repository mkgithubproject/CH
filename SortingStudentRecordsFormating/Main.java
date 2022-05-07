import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    private static Student[] readData(String filename) throws FileNotFoundException {
        File file=new File(filename);
        Scanner sc=new Scanner(file);
        Student studentRecords[] =new Student[100];
        int indexCount=0;
        while(sc.hasNextLine()){
            String studentRecord=sc.nextLine();
            String arr[]=studentRecord.split(" ");
            Student stu=new Student(arr[0],Integer.parseInt(arr[1]),Integer.parseInt(arr[2]),Integer.parseInt(arr[3]));
            studentRecords[indexCount++]=stu;
            sc.nextLine();
        }
        // Using selection sort, sort the student record
        for(int i = 0; i < indexCount; i++)
        {    int index=i;
            for(int j = i; j < indexCount; j++){//
                if(studentRecords[j].getAverage()>studentRecords[index].getAverage()){
                    index=j;
                }else if(studentRecords[j].getAverage()==studentRecords[index].getAverage() && studentRecords[j].getPhysic()>studentRecords[index].getPhysic()){
                    index=j;

                }else if(studentRecords[j].getAverage()==studentRecords[index].getAverage() && studentRecords[j].getPhysic()==studentRecords[index].getPhysic() && studentRecords[j].getChemistry()>studentRecords[index].getChemistry()){
                    index=j;
                }else if(studentRecords[j].getAverage()==studentRecords[index].getAverage() && studentRecords[j].getPhysic()==studentRecords[index].getPhysic()&& studentRecords[j].getChemistry()==studentRecords[index].getChemistry() && studentRecords[j].getMath()>studentRecords[index].getMath()){
                    index=j;
                }else if(studentRecords[j].getAverage()==studentRecords[index].getAverage() && studentRecords[j].getPhysic()==studentRecords[index].getPhysic()&& studentRecords[j].getChemistry()==studentRecords[index].getChemistry() && studentRecords[j].getMath()>studentRecords[index].getMath() && studentRecords[j].getName().compareTo(studentRecords[index].getName())<0){
                    index=j;
                }
            }
            // swap students records
            Student temp=studentRecords[index];
            studentRecords[index]=studentRecords[i];
            studentRecords[i]=temp;
        }
        return studentRecords;
    }
    public static void main(String[] args) throws FileNotFoundException {
       Student[] arr= readData("D:\\mk\\src\\student.txt");
        System.out.format("%-10s%10s%10s%10s%10s\n","Student","AverageScore","Physics","Chemistry","Math");
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=null){
                System.out.format("%-10s%10s%10s%10s%10s\n",arr[i].getName(),arr[i].getAverage(),arr[i].getPhysic(),arr[i].getChemistry(),arr[i].getMath());
            }
        }
    }
}
