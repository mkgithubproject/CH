import javax.swing.JOptionPane;    // Needed for Dialog Box
public class CompoundInterest
{
    public static void main(String[] args)
    {
        // Prompt user to input .
        while(true){
            String input1= JOptionPane.showInputDialog("How much are you investing?(>0)");
            String input2= JOptionPane.showInputDialog("What is the interest rate?(0-10%)");
            double investment=Double.parseDouble(input1);// convert input string to double
            double interestRate=Double.parseDouble(input2);// convert string to double
            if(investment<=0 || interestRate>10){// check if investment is less than 0 or rate >10 show error message
                JOptionPane.showMessageDialog(null, "Your interest rate is out of range or your dollars are negative!\nPlease try again...");
            }else{
                String result="";
                for(int i=1;i<=10;i++){
                    result=result+"After "+i+ " year, your money will have grown to $"+String.format("%.2f",(investment)*Math.pow(1+(interestRate/100),i))+"\n";
                }
                JOptionPane.showMessageDialog(null, result);
                break;
            }
        }


    }
}
